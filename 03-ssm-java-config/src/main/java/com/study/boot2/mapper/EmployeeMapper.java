package com.study.boot2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.boot2.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/11 上午9:24
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
