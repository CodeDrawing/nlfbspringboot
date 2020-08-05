package top.zwzx.nlfb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zwzx.nlfb.mapper.TeacherMapper;
import top.zwzx.nlfb.pojo.TeacherInfo;

import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/
@Service
public class TeacherServiceImpl implements ITeacherService{
    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public List<TeacherInfo> selectAllTeacherInfo() {
        List<TeacherInfo> teacherInfos = teacherMapper.selectAllTeacherInfo();
        return teacherInfos;
    }

    @Override
    public int insertTeacherInfo(TeacherInfo teacherInfo) {
        int i = teacherMapper.insertTeacherInfo(teacherInfo);
        return i;
    }
}
