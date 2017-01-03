package com.board.DAO;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 2017-01-02.
 */
@Repository
public class BoardDao {
    @Autowired
    @Qualifier("")
    private SqlSessionFactory sqlSessionFactory;

    public void select() {
    }
}
