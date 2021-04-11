package com.study.boot2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/11 上午9:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tbl_employee")
public class Employee {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    private Integer age;
    private Date birthday;

}
