package vo;

import lombok.Data;

/**
 * @author jw.ma
 * @title: Result
 * @description: TODO
 * @date 2021/7/24 18:16
 */
@Data
public class Result {
    /**
     * 姓名
     */
    private String username;
    /**
     * 检查结果
     */
    private Boolean result;
}
