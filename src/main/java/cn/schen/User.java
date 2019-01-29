package cn.schen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Auther: chenSheng
 * @Date: 2019/1/29 11:26
 * @Description:
 */
@AllArgsConstructor               //全参构造函数
@NoArgsConstructor                //空参构造函数
@Accessors(chain = true)          //支持链式调用
@Data                             //自动生成set、get方法
public class User {
    private String username;
    private Integer age;
}
