package service.impl;

import service.StrategyService;

/**
 * @author jw.ma
 * @title: Context
 * @description: TODO
 * @date 2021/8/1 23:03
 */
public class Context {
    private StrategyService strategyService;
    public Context(StrategyService strategyService) {
        this.strategyService = strategyService;
    }
    public int executeStrategy(int num1, int num2){
        return strategyService.doOperation(num1, num2);
    }
}
