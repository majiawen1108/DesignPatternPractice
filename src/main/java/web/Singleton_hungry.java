package web;

/**
 * @author jw.ma
 * @title: Singleton_hungry
 * @description: TODO
 * @date 2021/8/2 21:42
 */
public class Singleton_hungry {
    private static Singleton_hungry instance = null;
    static {
        instance = new Singleton_hungry();
    }
    private Singleton_hungry() {
    }
    public Singleton_hungry getInstance() {
        return this.instance;
    }
}
