package top.zwzx.nlfb.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.zwzx.nlfb.pojo.Course;
import top.zwzx.nlfb.pojo.StudentInfo;
import top.zwzx.nlfb.pojo.TeacherInfo;
import top.zwzx.nlfb.service.CourseServiceImpl;
import top.zwzx.nlfb.service.IStudentService;
import top.zwzx.nlfb.service.StudentSericeImpl;
import top.zwzx.nlfb.service.TeacherServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/
@RestController
@CrossOrigin
public class Controller {
    @Autowired
    StudentSericeImpl studentSericeImpl;
    @Autowired
    TeacherServiceImpl teacherService;
    @Autowired
    CourseServiceImpl courseService;


    @RequestMapping("/studentInfo")
    public List<StudentInfo> studentInfo(){
        List<StudentInfo> studentInfos = studentSericeImpl.selectAllStudentInfo();
        return studentInfos;
    }

    @RequestMapping("/teacherInfo")
    public List<TeacherInfo> teacherInfo(){
        List<TeacherInfo> teacherInfos = teacherService.selectAllTeacherInfo();
        return teacherInfos;
    }

    @RequestMapping("/courseInfo")
    public List<Course> courseInfo(){
        List<Course> courses = courseService.selectAllCourseInfo();
        return courses;
    }
//    @RequestMapping("/test")
//    public TeacherInfo test(TeacherInfo teacherInfo){
//        System.out.println(teacherInfo.getTName());
//        System.out.println(teacherInfo.getPhonenumber());
//        System.out.println(teacherInfo.getAddress());
//        TeacherInfo teacherInfo1 = new TeacherInfo();
//        teacherInfo1.setTName("张老师");
//        return teacherInfo1;
//    }
    @RequestMapping("/insertTeacherInfo")
    public int insertTeacherInfo(TeacherInfo teacherInfo){
        int i = teacherService.insertTeacherInfo(teacherInfo);
        return i;
    }

//    @RequestMapping("/studentInfo")
//    public List<StudentInfo> sutdentinfo(){
//        ArrayList<StudentInfo> studentInfos = new ArrayList<>();
//        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.setName("张三");
//        studentInfo.setTeacher("赵老师");
//        studentInfo.setComeDate(new Date());
//        studentInfo.setLastCourse(5);
//        StudentInfo studentInfo1 = new StudentInfo();
//        studentInfo1.setName("李四");
//        studentInfo1.setTeacher("赵老师");
//        studentInfo1.setComeDate(new Date());
//        studentInfo1.setLastCourse(5);
//        studentInfos.add(studentInfo1);
//        studentInfos.add(studentInfo);
//        return studentInfos;
//    }
}
