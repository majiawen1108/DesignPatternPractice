package service.impl;

import service.Examine;
import vo.Person;
import vo.Result;

/**
 * @author jw.ma
 * @title: UnInfected
 * @description: TODO
 * @date 2021/7/24 18:15
 */
public class UnInfected implements Examine {
    @Override
    public Result check(Person person) {
        Result result = new Result();
        if (null != person){
            result.setUsername(person.getName());
            result.setResult(false);
        }
        return result;
    }
}
