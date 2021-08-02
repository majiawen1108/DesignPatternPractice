package vo;

/**
 * @author jw.ma
 * @title: Handler
 * @description: TODO
 * @date 2021/8/1 16:33
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
    //处理请求的方法
    public abstract void handleRequest(String request);
}
