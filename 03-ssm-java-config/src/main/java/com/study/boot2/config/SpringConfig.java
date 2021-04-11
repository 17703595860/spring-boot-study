package com.study.boot2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HLH
 * @email 17703595860@163.com
 * @date : Created in  2021/4/11 上午9:23
 */
@ComponentScan(basePackages = "com.study.boot2", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, RestController.class})
})
public class SpringConfig {
}
