package com.study.boot2.controller;

import com.study.boot2.entity.Employee;
import com.study.boot2.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/11 上午9:24
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping
    @ResponseBody
    public List<Employee> selectAll() {
        return employeeMapper.selectList(null);
    }

    @GetMapping("/datasource")
    @ResponseBody
    public String dataSource() {
        return dataSource.toString();
    }

}
