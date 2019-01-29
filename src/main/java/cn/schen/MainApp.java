package cn.schen;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
/**
 * @Auther: chenSheng
 * @Date: 2019/1/29 11:40
 * @Description:
 */
public class MainApp {
    public static void main(String[] args) {
        List<String> collected ;
        //map操作
        collected = Stream.of("a","b","c").map(str->{
            return str.toUpperCase();
        }).collect(toList());
        collected.stream().filter(s->{
            System.out.println(s);
            return true;
        }).count();
    }
}
