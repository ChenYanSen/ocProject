package com.online.college.rest.dto;

import com.online.college.core.consts.domain.ConstsClassify;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:cys
 * @Date:Created in 15:05 2017/11/15
 */
public  class ClassifyDto2 extends ConstsClassify {
    //二级分类
    private List<ConstsClassify> subClassify = new ArrayList<ConstsClassify>();

    public List<ConstsClassify> getSubClassify() {
        return subClassify;
    }

    public void setSubClassify(List<ConstsClassify> subClassify) {
        this.subClassify = subClassify;
    }
}
