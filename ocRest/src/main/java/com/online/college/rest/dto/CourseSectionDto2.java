package com.online.college.rest.dto;

import com.online.college.core.course.domain.CourseSection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:cys
 * @Date:Created in 9:38 2017/11/16
 */
public class CourseSectionDto2 extends CourseSection {
    private List<CourseSection> sectionList=new ArrayList<>();

    public List<CourseSection> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<CourseSection> sectionList) {
        this.sectionList = sectionList;
    }
}
