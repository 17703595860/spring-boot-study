package com.study.boot2.mapper;

import com.study.boot2.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import javax.xml.transform.Source;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/11 上午10:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class EmployeeMapperTest {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void test() throws SQLException {
        System.out.println(dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
        System.out.println(employeeMapper.selectList(null));
    }

}