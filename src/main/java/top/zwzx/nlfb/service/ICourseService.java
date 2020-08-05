package top.zwzx.nlfb.service;

import top.zwzx.nlfb.pojo.Course;

import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/
public interface ICourseService {
    List<Course> selectAllCourseInfo();
}
