package com.online.college.rest.business.impl;

import com.online.college.core.course.domain.CourseSection;
import com.online.college.core.course.service.ICourseSectionService;
import com.online.college.rest.business.ICourseSectionBusiness2;
import com.online.college.rest.dto.CourseSectionDto2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:cys
 * @Date:Created in 9:44 2017/11/16
 */
@Component
public class CourseSectionBusinessImpl2 implements ICourseSectionBusiness2 {
    @Autowired
    private ICourseSectionService courseSectionService;

    @Override
    public Map<Long, CourseSectionDto2> getAllCourseSection(Long courseId) {
        CourseSection courseSection=new CourseSection();
        courseSection.setCourseId(courseId);
        List<CourseSection> courseSectionList = courseSectionService.queryAll(courseSection);
        Map<Long,CourseSectionDto2> hashMap=new HashMap<>();
        for(CourseSection item:courseSectionList){
            if(Long.valueOf(0).equals(item.getParentId())){
                CourseSectionDto2 courseSectionDto2=new CourseSectionDto2();
                BeanUtils.copyProperties(item,courseSectionDto2);
                hashMap.put(courseSectionDto2.getId(),courseSectionDto2);
            }else {
                hashMap.get(item.getParentId()).getSectionList().add(item);
            }
        }

        return null;
    }
}
