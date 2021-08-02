package service.impl;

import service.StrategyService;

/**
 * @author jw.ma
 * @title: OperationAdd
 * @description: TODO
 * @date 2021/8/1 23:05
 */
public class OperationMultiply implements StrategyService {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
