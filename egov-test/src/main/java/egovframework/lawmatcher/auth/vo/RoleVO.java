package egovframework.lawmatcher.auth.vo;

import java.io.Serializable;
import java.util.Objects;

public class RoleVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String roleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoleVO roleVO = (RoleVO) o;
        return Objects.equals(id, roleVO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
