package com.wangjing.greendaoutil.db;

import com.wangjing.greendaoutil.dao.StudentDao;

/**
 * Created by Administrator on 2017/7/4.
 */

public class DbUtil {
    private static StudentHelper studentHelper;

    private static StudentDao getStudentDao() {
        return DbCore.getDaoSession().getStudentDao();
    }

    public static StudentHelper getStudentHelper() {
        if (studentHelper == null) {
            studentHelper = new StudentHelper(getStudentDao());
        }
        return studentHelper;
    }
}
