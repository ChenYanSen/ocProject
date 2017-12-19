package com.online.college.rest.business.impl;

import com.online.college.common.web.SpringBeanFactory;
import com.online.college.rest.business.IClassifyBusiness2;
import com.online.college.rest.dto.ClassifyDto2;
import junit.framework.TestCase;

import java.util.Map;

/**
 * @Author:cys
 * @Date:Created in 17:17 2017/11/15
 */
public class ClassifyBusinessImpl2Test extends TestCase {
    public void testGetAllClassify() throws Exception {

        IClassifyBusiness2 ic= (IClassifyBusiness2) SpringBeanFactory.getBean("classifyBusinessImpl2");
        Map<String, ClassifyDto2> allClassify = ic.getAllClassify();
        for(String str:allClassify.keySet()){
            System.out.println(allClassify.get(str).toString());
        }

    }

}