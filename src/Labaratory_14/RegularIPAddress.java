package Labaratory_14;

import java.util.Random;

public class RegularIPAddress {
    public static final String IP_PATTERN = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";

    static void main(){
        Random r = new Random();
        String ip = String.format("%d.%d.%d.%d", r.nextInt(256), r.nextInt(256),  r.nextInt(256),  r.nextInt(256));
        System.out.print(ip+ "\t");
        System.out.println(ip.matches(IP_PATTERN));
        ip = "264.1.1.1";
        System.out.print(ip+ "\t");
        System.out.println(ip.matches(IP_PATTERN));
    }
}
