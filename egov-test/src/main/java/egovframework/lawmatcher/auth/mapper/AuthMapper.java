package egovframework.lawmatcher.auth.mapper;

import java.util.List;
import org.egovframe.rte.psl.dataaccess.mapper.EgovMapper;
import egovframework.lawmatcher.auth.vo.UserVO;
import egovframework.lawmatcher.auth.vo.RoleVO;

@EgovMapper("authMapper")
public interface AuthMapper {
    UserVO selectUserByUsername(String username) throws Exception;
    List<RoleVO> selectRolesByUserId(int userId) throws Exception;
    int insertUser(UserVO user) throws Exception;
}
