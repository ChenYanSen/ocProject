package com.online.college.rest.business.impl;

import com.online.college.core.consts.domain.ConstsClassify;
import com.online.college.core.consts.service.IConstsClassifyService;
import com.online.college.rest.business.IClassifyBusiness2;
import com.online.college.rest.dto.ClassifyDto2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:cys
 * @Date:Created in 15:14 2017/11/15
 */
@Component
public class ClassifyBusinessImpl2 implements IClassifyBusiness2 {
    @Autowired
    private IConstsClassifyService constsClassifyService;

    @Override
    public Map<String, ClassifyDto2> getAllClassify() {
        Map<String,ClassifyDto2> hashMap=new HashMap<>();
        List<ConstsClassify> constsClassifyList = constsClassifyService.queryAll();
        for (int i = 0; i < constsClassifyList.size(); i++) {
            ConstsClassify constsClassify = constsClassifyList.get(i);
            if("0".equals(constsClassify.getCode())){   //一级分类
                ClassifyDto2 classifyDto2=new ClassifyDto2();
                BeanUtils.copyProperties(constsClassify,classifyDto2);
                hashMap.put(constsClassify.getCode(),classifyDto2);
            }else {
                if(null!=hashMap.get(constsClassify.getParentCode())){
                    hashMap.get(constsClassify.getParentCode()).getSubClassify().add(constsClassify);
                }
            }
        }

        return hashMap;
    }
}
