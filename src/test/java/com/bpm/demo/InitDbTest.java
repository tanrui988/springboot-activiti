package com.bpm.demo;

import org.activiti.engine.impl.db.DbSchemaCreate;
import org.junit.jupiter.api.Test;

/**
 * @Descrption: TODO
 * @Author: admin
 * @Date: 2020/8/26 18:09
 * @Version: 1.0.0
 **/
public class InitDbTest {

    @Test
    public void initDbSql(){
        DbSchemaCreate.main(new String[]{});
    }
}
