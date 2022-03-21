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
        public static Date birthday=new Date();

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


        public long birthdaycount(){
            System.out.println("请输入出生日期：XXXX-XX-XX");
            Scanner sc = new Scanner(System.in);
            String  birth = sc.next();
//            System.out.println(birth);

            long todayDateSeconds = todayDate.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //判断是否年月日是否符合规范 xxxx-xx-xx
            try {
                birthday = sdf.parse(birth);
            }catch (Exception e){
                System.out.println("日期格式错误，请重新输入");
                birthdaycount();//递归方法
            }
            // TODO: 2022/3/21 判断输入日期字符大小是否符合规范

//            System.out.println(birth);
                long birthdaySeconds = birthday.getTime();
//            System.out.println(birthdaySeconds);

            return ((todayDateSeconds-birthdaySeconds)/1000/60/60/24);
        }
    }


