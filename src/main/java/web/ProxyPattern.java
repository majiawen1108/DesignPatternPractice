package web;

import service.FoodService;
import service.impl.FoodServiceImpl;
import vo.Food;

/**
 * @author jw.ma
 * @title: ProxyPattern
 * @description: TODO
 * @date 2021/7/24 21:38
 */
public class ProxyPattern implements FoodService {
    private FoodService service  = new FoodServiceImpl();

    @Override
    public Food makeNjduck() {
        System.out.println("---------开始制作南京烤鸭----------");
        Food food = service.makeNjduck();
        System.out.println("---------制作完成---------");
        System.out.println("用料情况为："+food.toString());
        return food;
    }

    @Override
    public Food makeBjduck() {
        System.out.println("---------开始制作北京烤鸭----------");
        Food food = service.makeBjduck();
        System.out.println("---------制作完成---------");
        System.out.println("用料情况为："+food.toString());
        return food;
    }

    static class main{
        public static void main(String[] args) {
            FoodService foodService = new ProxyPattern();
            foodService.makeNjduck();
            foodService.makeBjduck();
        }
    }
}
