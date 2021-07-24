package vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author jw.ma
 * @title: Person
 * @description: TODO
 * @date 2021/7/24 17:57
 */
@Data
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private String age;
    /**
     * 地址
     */
    private String address;
    /**
     * 是否感染
     */
    private Boolean isok;
}
