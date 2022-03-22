import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        //输出今天的日期
        DateUtil.todaytostring();
        //输入年份并判断
        while (Scan.BirthYear==-1) {
            Scan.Scan_BirthYear();
        }
        while (Scan.BirthMonth==-1) {
            Scan.Scan_BirthMonth();
        }
        while (Scan.BirthDay==-1) {
            Scan.Scan_BirthDay();
        }
        System.out.println(Scan.BirthYear);
        System.out.println(Scan.BirthMonth);
        System.out.println(Scan.BirthDay);

//        int y=Scan.Scan_BirthYear();
//        while (y==-1){
//            System.out.println(Scan.Scan_BirthYear());
//            System.out.println("年份输入错误！请重新输入！");
//        }
//        //输入月份并判断
//        while (Scan.Scan_BirthMonth()==-1){
//            System.out.println("月份输入错误！请重新输入！");
//        }
//        //输入日期并判断
//        while (Scan.Scan_BirthDay()==-1){
//            System.out.println("日期输入错误！请重新输入！");
//        }
//        System.out.println(Scan.BirthYear);
//        System.out.println(Scan.BirthMonth);
//        System.out.println(Scan.BirthDay);
//        System.out.println(Scan.Scan_BirthYear());
//        System.out.println(Scan.Scan_BirthMonth());
//        System.out.println(Scan.Scan_BirthDay());
//        DateUtil dateUtil=new DateUtil();
//        dateUtil.birthdaycount();
        System.out.println("你在这个世界已经生存了"+DateUtil.BirthToNowDays+"天");
//        if(BirthToNow<0){
//            System.out.println("你还未出生");
//        }else{
//            System.out.println("你在这个世界已经生存了"+BirthToNow+"天");
//        }
    }
}
