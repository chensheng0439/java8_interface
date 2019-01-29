package cn.schen;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        List<User> names = new ArrayList<>();
        User user = new User();
        user.setUsername("cs");
        names.add(user);
        User user1 = new User();
        user1.setUsername("ls");
        names.add(user1);
        User user2 = new User();
        user2.setUsername("dc");
        names.add(user2);
        User user3 = new User();
        user3.setUsername("fb");
        names.add(user3);
        User user4 = new User();
        user4.setUsername("yzk");
        names.add(user4);
        User user5 = new User();
        user5.setUsername("cqf");
        names.add(user5);
        //返回的结果依然是流，则为惰性求值，返回值为空或另一个值，则为及早求值
        names.stream().filter(user6->{                  //  惰性求值，不会打印名字信息
            System.out.println(user6.getUsername());
            return user6.getUsername().equals("cs");
        });

        names.stream().filter(user6->{                 //终止流操作，打印名字信息
            System.out.println(user6.getUsername());
            return user6.getUsername().equals("cs");
        }).count();
    }
}
