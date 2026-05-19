package Labaratory_15;



import Labaratory_14.RegularIPAddress;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IPInFile {
     static void main(){
         Pattern pattern = Pattern.compile(RegularIPAddress.IP_PATTERN);
         Matcher matcher = pattern.matcher(RegularIPAddress.IP);
         String resultMessage;
         if (matcher.find()) {
             String foundIp = matcher.group();
             resultMessage = "Найден корректный IP-адрес: " + foundIp;
         } else {
             resultMessage = "Корректного IP-адреса в строке не обнаружено.";
         }
         registerInFile(resultMessage);
    }
    static void registerInFile(String ip){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/faringen/Документы/IdeaProjects/all-works/src/Labaratory_15/result.txt"))) {
            bufferedWriter.write(ip);
            System.out.println("Info written in file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
