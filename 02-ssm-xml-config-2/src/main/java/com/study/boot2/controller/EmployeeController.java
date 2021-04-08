package com.study.boot2.controller;

import com.study.boot2.entity.Employee;
import com.study.boot2.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/8 下午9:56
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    DataSource dataSource;

    @GetMapping
    @ResponseBody
    public List<Employee> SelectAll() {
        return employeeMapper.selectList(null);
    }

    @GetMapping("/jsp")
    public String jsp() {
        return "aaa";
    }

    @GetMapping("/datasouce")
    @ResponseBody
    public DataSource test(){
        return dataSource;
    }

}
