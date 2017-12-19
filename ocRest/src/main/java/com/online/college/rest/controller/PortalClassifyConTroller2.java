package com.online.college.rest.controller;

import com.online.college.common.web.JsonView;
import com.online.college.rest.business.IClassifyBusiness2;
import com.online.college.rest.dto.ClassifyDto2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author:cys
 * @Date:Created in 17:07 2017/11/14
 */
@Controller
public class PortalClassifyConTroller2 {
    @Autowired
    private IClassifyBusiness2 classifyBusiness2;


    @GetMapping("/getClassifyJson2")
    //相当于 @RequestMapping  @ResponseBody
    public String getClassifyJson(){
      try {
          Map<String,ClassifyDto2> hashMap=classifyBusiness2.getAllClassify();
          List<ClassifyDto2>  list=new ArrayList<>();
          for(String key:hashMap.keySet()){
              list.add(hashMap.get(key));
          }
          return JsonView.render(list);
      }catch (Exception e){
          return JsonView.render(17001);
      }
    }
}
