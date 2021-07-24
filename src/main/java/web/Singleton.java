package web;

/**
 * @author jw.ma
 * @title: Singleton
 * @description: TODO
 * @date 2021/7/24 21:08
 */
public class Singleton {
    //私有构造防止new Singleton();
    private Singleton(){};

    private static class Inside{
        private static Singleton singleton = new Singleton();
    }
    public static Singleton getSingleton(){
        return Inside.singleton;
    }
}
