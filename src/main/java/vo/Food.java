package vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author jw.ma
 * @title: Food
 * @description: TODO
 * @date 2021/7/24 21:43
 */
@Data
public class Food {
    private String salt;
    @NotNull(message = "soil is can't be null!")
    private String soil;

    @Override
    public String toString() {
        return "Food{" +
                "salt='" + salt + '\'' +
                ", soil='" + soil + '\'' +
                '}';
    }
}
