package cn.schen;

import java.util.Comparator;
import java.util.List;
import static java.util.Arrays.asList;

/**
 * @Auther: chenSheng
 * @Date: 2019/1/29 13:35
 * @Description:
 */
public class MaxAndMin {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("cs").setAge(20);

        User user1 = new User();
        user1.setUsername("ls").setAge(21);

        User user2 = new User();
        user2.setUsername("fb").setAge(22);

        List<User> users = asList(user,user1,user2);

        User user4 = users.stream().max(Comparator.comparing(u->u.getAge())).get();
        System.out.println(user4);
        //简化写法
       /* User user4 = users.stream().max((u1,u2)->u2.getAge()-u1.getAge()).get();
        System.out.println(user4);*/
    }
}
