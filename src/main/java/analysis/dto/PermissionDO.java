package analysis.dto;

import analysis.base.BaseDO;
import java.io.Serializable;
import lombok.Data;

/**
 * 反欺诈接口数据实体类
 *
 * @author liuheng
 * @version 1.0
 * @since 2018/09/19
 */
@Data
public class PermissionDO extends BaseDO implements Serializable {

    private String name;
    private String desc;
    private String url;

}
