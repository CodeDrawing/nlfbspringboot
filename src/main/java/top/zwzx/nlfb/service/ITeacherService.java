package top.zwzx.nlfb.service;

import top.zwzx.nlfb.pojo.TeacherInfo;

import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/
public interface ITeacherService {

    List<TeacherInfo> selectAllTeacherInfo();
    int insertTeacherInfo(TeacherInfo teacherInfo);
}
