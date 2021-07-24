package service;

import vo.Person;
import vo.Result;

/**
 * @author jw.ma
 * @title: Examine
 * @description: TODO
 * @date 2021/7/24 17:54
 */
public interface Examine {
    Result check(Person person);
}
