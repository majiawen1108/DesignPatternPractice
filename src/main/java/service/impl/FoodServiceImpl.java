package service.impl;

import service.FoodService;
import vo.Food;

/**
 * @author jw.ma
 * @title: FoodServiceImpl
 * @description: TODO
 * @date 2021/7/24 21:48
 */
public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeNjduck() {
        Food f = new Food();
        f.setSalt("111");
        f.setSoil("222");
        return f;
    }

    @Override
    public Food makeBjduck() {
        Food f = new Food();
        f.setSalt("233");
        f.setSoil("333");
        return f;
    }
}
