import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        DateUtil.todaytostring();
        DateUtil dateUtil=new DateUtil();
        long BirthToNow=dateUtil.birthdaycount();
        if(BirthToNow<0){
            System.out.println("你还未出生");
        }else{
            System.out.println("你在这个世界已经生存了"+BirthToNow+"天");
        }
    }
}
