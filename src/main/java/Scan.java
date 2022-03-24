import java.util.Scanner;

/**
 * @Classname Scan
 * @Description TODO
 * @Date 2022/3/22 23:15
 * @Created by yuzai
 */
public class Scan {
    static int BirthYear=-1;
    static int BirthMonth=-1;
    static int BirthDay=-1;
    static int HopeAge=-1;
    //输入年份并判断
    public static void Scan_BirthYear(){
        System.out.println("请输入出生年份：(1900-2100)");
        Scanner sc = new Scanner(System.in);
        try {
            int Year = Integer.parseInt(sc.next());
            if (1900<=Year && Year<=2100){
//                System.out.println("年份输入正确");
                BirthYear = Year;
            }else {
                System.out.println("年份范围错误！请重新输入");
                Scan_BirthYear();
            }
        }catch (Exception e){
            System.out.println("年份输入错误！请重新输入");
            BirthYear = -1;
        }
    }
    //输入月份并判断
    public static void Scan_BirthMonth(){
        System.out.println("请输入出生月份：(1-12)");
        Scanner sc = new Scanner(System.in);
        try {
            int Month = Integer.parseInt(sc.next());
            if (1<=Month && Month<=12){
//                System.out.println("月份输入正确！");
                BirthMonth = Month;
            }else {
                System.out.println("月份范围错误！请重新输入");
                Scan_BirthMonth();
            }
        }catch (Exception e){
            System.out.println("月份输入错误！请重新输入");
            BirthMonth = -1;
        }
    }
    //输入日期并判断
    public static void Scan_BirthDay(){
        System.out.println("请输入出生日期：(1-31)");
        Scanner sc = new Scanner(System.in);
        try {
            int Day = Integer.parseInt(sc.next());
            if (1<=Day && Day<=31){
//                System.out.println("日期输入正确！");
                BirthDay = Day;
            }else {
                System.out.println("日期范围错误！请重新输入");
                Scan_BirthDay();
            }
        }catch (Exception e){
            System.out.println("日期输入错误！请重新输入");
            BirthDay = -1;
        }
    }

    public static void Scan_HopeAge(){
        System.out.println("请输入你期望的年龄:");
        Scanner sc = new Scanner(System.in);
        try {
            int Age = Integer.parseInt(sc.next());
                HopeAge = Age;
        }catch (Exception e){
            System.out.println("期望年龄输入错误！");
            HopeAge = -1;
        }
    }
    public static void main(String[] args) {
        while (BirthYear==-1) {
            Scan_BirthYear();
        }
    }
}
