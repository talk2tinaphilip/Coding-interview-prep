package interviewPrep;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
        String str[] = s.split(":");
        int hh = Integer.parseInt(str[0]);
        int mm = Integer.parseInt(str[1]);
        int ss = Integer.parseInt(str[2].substring(0, 2));
        if((str[2].substring(2,4).equals("PM")) && (hh < 12)){
           hh += 12;
        }
        else if(str[2].substring(2,4).equals("AM") && hh == 12){
            hh = 00;
        }
        String time = String.format("%02d", hh)+":"+String.format("%02d", mm)+":"+String.format("%02d", ss);
        return time;
    }

    public static void main(String[] args) {
        String s = "07:05:45PM";
        String result = timeConversion(s);
        System.out.println(result);
    }
}
