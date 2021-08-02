package service.impl;

import vo.Handler;

/**
 * @author jw.ma
 * @title: ChainOne
 * @description: TODO
 * @date 2021/8/1 16:35
 */
public class ChainOne extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("one".equals(request)){
            System.out.println("具体处理者1负责处理该请求！");
        }else {
            if (getNext() != null){
                getNext().handleRequest(request);
            }else {
                System.out.println("没有人处理！");
            }
        }
    }
}
