package fifth_demo.io;

import mybatis.model.SysRole;
import org.apache.commons.lang3.time.DateUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (FileOutputStream out  =(new FileOutputStream("./src/main/resources/io3.txt"))){
            //int n = in.nextInt();
        Path path = Paths.get("./src/main/resources/io.txt");

        byte[] bytes = Files.readAllBytes(path);
        String byteString =  new String(bytes,StandardCharsets.UTF_8);

        String s1 = "\nI am a handsome boy";
        Files.write(path,s1.getBytes(), StandardOpenOption.APPEND);
       String s2 = "this is fantastic";
       BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter("./src/main/resources/io4.txt"));
       bufferedWriter.write(s1);
       bufferedWriter.close();

       String s4 = "message";
       s4.indexOf("age");
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("haha");
       stringBuilder.insert(1,"jfdls");



        System.out.println(stringBuilder);


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            int b=1;
        }


    }
}
class A{}