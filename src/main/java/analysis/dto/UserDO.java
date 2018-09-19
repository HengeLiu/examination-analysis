package analysis.dto;

import analysis.base.BaseDO;
import java.util.List;
import lombok.Data;

import java.io.Serializable;
/**
 * 用户
 * @auther elio
 * @date 2018/9/18
 */
@Data
public class UserDO extends BaseDO implements Serializable {
    private static final long serialVersionUID = -6582733242459105563L;
    private String userCode;
    private String name;
    private String password;
    private String note;

    private List<RoleDO> roles;

}
