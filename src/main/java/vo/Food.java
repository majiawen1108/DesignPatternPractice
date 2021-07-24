package vo;

import lombok.Data;

/**
 * @author jw.ma
 * @title: Food
 * @description: TODO
 * @date 2021/7/24 21:43
 */
@Data
public class Food {
    private String salt;
    private String soil;

    @Override
    public String toString() {
        return "Food{" +
                "salt='" + salt + '\'' +
                ", soil='" + soil + '\'' +
                '}';
    }
}
