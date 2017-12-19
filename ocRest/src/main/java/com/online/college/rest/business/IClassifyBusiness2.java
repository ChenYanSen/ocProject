package com.online.college.rest.business;

import com.online.college.common.web.SpringBeanFactory;
import com.online.college.rest.dto.ClassifyDto2;

import java.util.Map;

/**
 * @Author:cys
 * @Date:Created in 15:11 2017/11/15
 */
public interface IClassifyBusiness2 {
    Map<String,ClassifyDto2> getAllClassify();


}
