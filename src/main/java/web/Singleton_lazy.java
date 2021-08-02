package web;

/**
 * @author jw.ma
 * @title: Singleton_lazy
 * @description: TODO
 * @date 2021/8/2 21:36
 */
public class Singleton_lazy {
    private static Singleton_lazy instance;

    private Singleton_lazy() {
    }
    public static Singleton_lazy getInstance(){
        if (instance == null){
            synchronized (Singleton_lazy.class){
                if (instance == null){
                    instance = new Singleton_lazy();
                }
            }

        }
        return instance;
    }
}
