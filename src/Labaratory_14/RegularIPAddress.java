package Labaratory_14;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularIPAddress {
    static Random r = new  Random();
    public static final String IP_PATTERN = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
    public static final String IP = String.format("%d.%d.%d.%d", r.nextInt(300), r.nextInt(300),  r.nextInt(300),  r.nextInt(300));

    static void main(){
        Pattern pattern = Pattern.compile(IP_PATTERN);
        Matcher matcher = pattern.matcher(IP);
        System.out.println("IP:" + IP+" - " + matcher.find());
    }
}
