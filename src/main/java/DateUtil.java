import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Classname DateUtil
 * @Description 日期计算工具
 * @Date 2022/3/21 12:41
 * @Created by yuzai
 */

    public class DateUtil {
        public static Date todayDate = new Date();
        public static Date birthDate=new Date();
        public static long  BirthToNowDays = 0;
        public static long HopeToNowDays=0;
        /**
        * 输入今天的日期
        */
        public static void todaytostring(){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String todaystr = sdf.format(todayDate);
            System.out.println("今天的日期是："+todaystr);
        }


        /**
         * day2-day1的计算的天数
         * @param day1
         * @param day2
         * @return day2-day1的计算的天数
         */
        public static long datecount(Date day1, Date day2){
            long days=(day2.getTime()-day1.getTime())/1000/60/60/24;
            return days>0 ?  days : -1;
        }


        public static void birthdaycount(int year,int month,int day) throws ParseException {
//            System.out.println(year);
//            System.out.println(month);
//            System.out.println(day);
            String birthday=String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
//            System.out.println(birthday);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            birthDate = sdf.parse(birthday); //解析生日拼接日期成date类型
//            System.out.println(birthDate);
            //获取生日和当天的时间戳
            long birthdaySeconds = birthDate.getTime();
            long todayDateSeconds = todayDate.getTime();
            BirthToNowDays = (todayDateSeconds - birthdaySeconds) / 1000 / 60 / 60 / 24;
        }
    public static void lifedaycount(int hopeage) throws ParseException {
        System.out.println(hopeage);
        //出生年份加期望年龄就是期望活到的年份
        int HopeYear= Scan.BirthYear+hopeage;
        String hopeday=String.valueOf(HopeYear)+"-"+String.valueOf(Scan.BirthMonth)+"-"+String.valueOf(Scan.BirthDay);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date hopedate=new Date();
        hopedate = sdf.parse(hopeday); //解析生日拼接日期成date类型
        System.out.println(hopedate);
        long hopedaySeconds = hopedate.getTime();
        long todayDateSeconds = todayDate.getTime();
        HopeToNowDays = (hopedaySeconds-todayDateSeconds) / 1000 / 60 / 60 / 24;
    }
    public static void main(String[] args) throws ParseException {
//        birthdaycount(2000,5,26);
//        System.out.println(DateUtil.BirthToNowDays);
//        lifedaycount(10);
    }

    }


