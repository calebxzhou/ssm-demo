package com.ssm.dao.impl;

import com.ssm.dao.StudentDao;

/**
 * Created  on 2023-09-24,17:01.
 */
public class StudentDaoImpl implements StudentDao {

    public boolean login(String id,String pwd){
        return (id.equals("student")&&pwd.equals("2031030184"));
    }
}
