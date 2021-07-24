package web;

import service.Examine;
import service.impl.Infected;
import service.impl.UnInfected;
import vo.Person;
import vo.Result;

/**
 * @author jw.ma
 * @title: FactoryPattern
 * @description: TODO
 * @date 2021/7/24 18:26
 */
public class FactoryPattern {
    public static void main(String[] args) {
        test1();
        test2();
    }
    private static void test1(){
        Examine examine = new UnInfected();
        Person person = new Person();
        person.setName("张先生");
        Result check = examine.check(person);
        String res = check.getResult()?"感染了":"未感染";
        System.out.println(check.getUsername()+res+"新冠肺炎");
    }
    private static void test2(){
        Examine examine = new Infected();
        Person person = new Person();
        person.setName("李先生");
        Result check = examine.check(person);
        String res = check.getResult()?"感染了":"未感染";
        System.out.println(check.getUsername()+res+"新冠肺炎");
    }
}
