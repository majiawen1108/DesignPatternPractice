package service.impl;

import service.Examine;
import vo.Person;
import vo.Result;

/**
 * @author jw.ma
 * @title: Infected
 * @description: TODO
 * @date 2021/7/24 18:22
 */
public class Infected implements Examine {
    @Override
    public Result check(Person person) {
        Result result = new Result();
        if (person != null){
            result.setUsername(person.getName());
            result.setResult(true);
        }
        return result;
    }
}
