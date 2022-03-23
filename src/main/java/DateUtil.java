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

//            try {
//                System.out.println("请输入出生日期：XXXX-XX-XX");
//                Scanner sc = new Scanner(System.in);
//                String birth = sc.next();
////            System.out.println(birth);
//                long todayDateSeconds = todayDate.getTime();
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                //判断是否年月日是否符合规范 xxxx-xx-xx
//                birthday = sdf.parse(birth); //解析日期成date类型
//                // TODO: 2022/3/21 判断输入日期字符大小是否符合规范
//                System.out.println("输入的生日:" + birth);
//                String[] strArr = birth.split("-");//以"-"分割字符串
//                String year_str = strArr[0];
//                String month_str = strArr[1];
//                String day_str = strArr[2];
////            System.out.println(year_str);
////            System.out.println(month_str);
////            System.out.println(day_str);
//                int y = Integer.parseInt(year_str);
//                int m = Integer.parseInt(month_str);
//                int d = Integer.parseInt(day_str);
//                System.out.println("年份："+y);
//                System.out.println("月份："+m);
//                System.out.println("日："+d);
//
//                long birthdaySeconds = birthday.getTime();
////            System.out.println(birthdaySeconds);
//                BirthToNowDays = (todayDateSeconds - birthdaySeconds) / 1000 / 60 / 60 / 24;
//                System.out.println(BirthToNowDays);
//
//            } catch (Exception e) {
//                System.out.println("日期格式错误，请重新输入");
//                birthdaycount();//递归方法
//            }

        }

    public static void main(String[] args) throws ParseException {
        birthdaycount(2000,5,26);
        System.out.println(DateUtil.BirthToNowDays);
    }

    }


