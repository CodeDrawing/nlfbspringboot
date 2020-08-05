package top.zwzx.nlfb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author zx
 * @date 2020/8/3
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentInfo {
    Integer sId;
    public String sName;
    public String tName;
    public Date comeDate;
    public Integer lastCourse;
}
