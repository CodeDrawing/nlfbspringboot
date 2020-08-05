package top.zwzx.nlfb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author zx
 * @date 2020/8/3
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    Integer cId;
    String cName;
    Integer tId;
    String tName;
    Date startTime;
    String time;

}
