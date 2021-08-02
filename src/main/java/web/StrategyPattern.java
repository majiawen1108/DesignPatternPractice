package web;

import service.impl.*;

/**
 * @author jw.ma
 * @title: StrategyPattern
 * @description: TODO
 * @date 2021/8/1 21:46
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("1 + 1 = " + context.executeStrategy(1, 1));
        context = new Context(new OperationSubstract());
        System.out.println("2 - 1 = " + context.executeStrategy(2, 1));
        context = new Context(new OperationMultiply());
        System.out.println("2 * 3 = " + context.executeStrategy(2, 3));
    }
}
