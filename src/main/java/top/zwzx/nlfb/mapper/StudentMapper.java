package top.zwzx.nlfb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.zwzx.nlfb.pojo.StudentInfo;

import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/
@Mapper
@Repository
public interface StudentMapper {
    List<StudentInfo> selectAllStudentInfo();
}
