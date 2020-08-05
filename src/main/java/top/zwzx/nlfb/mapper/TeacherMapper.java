package top.zwzx.nlfb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.zwzx.nlfb.pojo.TeacherInfo;

import java.util.List;

/**
 * @author zx
 * @date 2020/8/3
 **/
@Mapper
@Repository
public interface TeacherMapper {
    List<TeacherInfo> selectAllTeacherInfo();
    int insertTeacherInfo(TeacherInfo teacherInfo);
}
