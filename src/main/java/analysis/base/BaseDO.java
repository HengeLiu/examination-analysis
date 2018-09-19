package analysis.base;

import lombok.Data;

import java.util.Date;

/**
 * 基础DTO
 * @auther elio
 * @date 2018/9/18
 */
@Data
public class BaseDO {
    private Long id;
    private Date createAt;
    private Date updateAt;
    private Byte isDel;
}
