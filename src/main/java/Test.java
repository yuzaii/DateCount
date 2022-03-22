import java.time.Year;
import java.util.Scanner;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2022/3/22 16:07
 * @Created by yuzai
 */
public class Test {
    public static void main(String[] args) {
//        while (true){
//            System.out.println("请输入出生年份：(1900-2100)");
//            Scanner sc = new Scanner(System.in);
//            String birth = sc.next();
//            System.out.println(birth);
//        }
//    test();
    }
    static void test() {
        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);
        String birth = sc.next();

        int y = 0;

        try {
            y = Integer.parseInt(birth); //将字符串解析成整型
        } catch (Exception e) {
            System.out.println("error");
            test();
        }
            System.out.println(y);
    }

}
