package analysis.dto;

import analysis.base.BaseDO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 角色
 * @author elio
 * @version 1.0
 * @since 2018/09/19
 */
@Data
public class RoleDO extends BaseDO implements Serializable {

    private String roleCode;
    private String name;
    private String note;

    private List<RoleDO> roleList = new ArrayList<>();

}
