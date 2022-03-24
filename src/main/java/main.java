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

        DateUtil.birthdaycount(Scan.BirthYear,Scan.BirthMonth,Scan.BirthDay);
        System.out.println("你的出生日期是:"+Scan.BirthYear+"年"+Scan.BirthMonth+"月"+Scan.BirthDay+"日");
        System.out.println("你在这个世界已经生存了"+DateUtil.BirthToNowDays+"天");

        while (Scan.HopeAge == -1) {
            Scan.Scan_HopeAge();
        }
//        System.out.println(Scan.HopeAge);
        DateUtil.lifedaycount(Scan.HopeAge);
        System.out.println("你期望的年龄是"+Scan.HopeAge+"岁，还将在这个世界生存"+DateUtil.HopeToNowDays+"天");
//        System.out.println(DateUtil.HopeToNowDays);

    }
}
