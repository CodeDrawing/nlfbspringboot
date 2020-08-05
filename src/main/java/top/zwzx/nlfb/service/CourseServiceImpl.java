package top.zwzx.nlfb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zwzx.nlfb.mapper.CourseMapper;
import top.zwzx.nlfb.pojo.Course;

import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/
@Service
public class CourseServiceImpl implements ICourseService{
    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> selectAllCourseInfo() {
        List<Course> courses = courseMapper.selectAllCourseInfo();
        return courses;
    }
}
