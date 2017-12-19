package com.online.college.rest.business;

import com.online.college.core.course.domain.Course;

import java.util.List;
import java.util.Map;

/**
 * @Author:cys
 * @Date:Created in 9:40 2017/11/16
 */
public interface ICourseBusiness2 {
    Map<String,List<Course>> getCourses();
}
