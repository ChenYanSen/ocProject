package com.online.college.rest.business;

import com.online.college.rest.dto.CourseSectionDto2;

import java.util.Map;

/**
 * @Author:cys
 * @Date:Created in 9:42 2017/11/16
 */
public interface ICourseSectionBusiness2 {

    /**
     * 获取某个章节
     */
    Map<Long,CourseSectionDto2> getAllCourseSection(Long courseId);
}
