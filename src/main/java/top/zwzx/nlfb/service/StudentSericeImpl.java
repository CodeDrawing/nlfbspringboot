package top.zwzx.nlfb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zwzx.nlfb.mapper.StudentMapper;
import top.zwzx.nlfb.pojo.StudentInfo;

import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/
@Service
public class StudentSericeImpl implements IStudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<StudentInfo> selectAllStudentInfo() {
        List<StudentInfo> studentInfos = studentMapper.selectAllStudentInfo();
        return studentInfos;
    }
}
