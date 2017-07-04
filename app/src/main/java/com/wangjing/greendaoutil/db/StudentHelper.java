package com.wangjing.greendaoutil.db;

import com.wangjing.greendaolibrary.BaseDbHelper;
import com.wangjing.greendaoutil.model.Student;

import org.greenrobot.greendao.AbstractDao;

/**
 * Created by Administrator on 2017/7/4.
 */

public class StudentHelper extends BaseDbHelper<Student,Long> {

    public StudentHelper(AbstractDao dao) {
        super(dao);
    }
}
