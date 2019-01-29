package cn.schen;

import java.util.List;
import java.util.stream.Stream;
import static java.util.Arrays.asList;          //静态导入
import static java.util.stream.Collectors.toList;

/**
 * @Auther: chenSheng
 * @Date: 2019/1/29 13:24
 * @Description:
 */

public class FlatMap {
    public static void main(String[] args) {
        //将多个流合并成一个
        List<Integer> together = Stream.of(asList(1,2),asList(3,4)).flatMap(i->
             i.stream()
        ).collect(toList());

        for(Integer i : together){
            System.out.println(i);
        }
    }
}
