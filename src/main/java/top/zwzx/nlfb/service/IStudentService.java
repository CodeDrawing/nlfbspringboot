package top.zwzx.nlfb.service;

import org.springframework.stereotype.Service;
import top.zwzx.nlfb.pojo.StudentInfo;

import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/

public interface IStudentService {
    List<StudentInfo> selectAllStudentInfo();

}
