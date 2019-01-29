package cn.schen;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.stream.Collectors.toList;

/**
 * @Auther: chenSheng
 * @Date: 2019/1/29 13:09
 * @Description:
 */
public class Filter {
    public static void main(String[] args) {
        List<String> lists = Stream.of("1cdssa","ksjad1","dsadad","1dassd")         // 找出列表中以数字开头的字符串
                .filter(str->isDigit(str.charAt(0)))
                .collect(toList());

        for(String s:lists){
            System.out.println(s);
        }
    }
}
