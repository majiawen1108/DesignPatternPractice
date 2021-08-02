package web;

import service.impl.ChainOne;
import service.impl.ChainTwo;
import vo.Handler;

/**
 * @author jw.ma
 * @title: Chain
 * @description: TODO
 * @date 2021/8/1 16:31
 */
public class Chain {
    public static void main(String[] args) {
        Handler handler = new ChainOne();
        Handler handler1 = new ChainTwo();
        handler.setNext(handler1);
        handler.handleRequest("Two");
    }
}
