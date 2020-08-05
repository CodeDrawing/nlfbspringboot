package top.zwzx.nlfb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author zx
 * @date 2020/8/3
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherInfo {
    Integer tId;
    String tName;
    String phonenumber;
    String address;
    String position;
}
