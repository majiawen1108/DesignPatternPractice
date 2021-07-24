package web;

import vo.Person;
import vo.Person2;

/**
 * @author jw.ma
 * @title: BuilderPattern
 * @description: TODO
 * @date 2021/7/24 21:20
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Person2 person = Person2.builder().name("Marry").address("China").age("12").isok(true).build();
        System.out.println(person.toString());
    }

}
