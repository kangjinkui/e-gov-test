package egovframework.lawmatcher.auth.service;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.annotation.Resource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.auth.mapper.AuthMapper;
import egovframework.lawmatcher.auth.vo.RoleVO;
import egovframework.lawmatcher.auth.vo.UserVO;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Resource(name = "authMapper")
    private AuthMapper authMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            UserVO user = authMapper.selectUserByUsername(username);
            if (user == null) {
                throw new UsernameNotFoundException("User not found: " + username);
            }
            List<RoleVO> roles = authMapper.selectRolesByUserId(user.getId());
            List<GrantedAuthority> authorities = roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoleName()))
                .collect(Collectors.toList());

            return User.withUsername(user.getUsername())
                .password(user.getPassword())
                .disabled(Boolean.FALSE.equals(user.getEnabled()))
                .authorities(authorities)
                .build();
        } catch (Exception e) {
            throw new UsernameNotFoundException("Failed to load user: " + username, e);
        }
    }
}
