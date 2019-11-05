package fifth_demo.cdd;

import lombok.Data;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.*;

//@SpringBootApplication
public class Main {
    public static void main(String[] args){
//        SpringApplication.run(Main.class,args);
//        a a1 = new a();
//        List<a> list = new ArrayList<a>();
//        list.add(a1);
//        list.add(a1);
//        list.add(a1);
//
//        StringBuilder strs = new StringBuilder();
//        list.stream().forEach( (a a2)  -> {
//            strs.append(a2.getI())
//                    .append(",")
//                    .append(a2.getJ())
//                    .append(";");
//        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date zero = calendar.getTime();

        DateFormatUtils.format(new Date(),"yyyy-MM-dd");
        System.out.println(DateFormatUtils.format(new Date(),"yyyy-MM-dd 00-00-00"));
        a a1 = new a();
        List<a> list = new ArrayList<a>();
        list.add(a1);
        list.add(a1);
        list.add(a1);

        StringBuilder strs = new StringBuilder();
        list.stream().forEach( (a a2)  -> {
            strs.append(a2.getI())
                    .append(",")
                    .append(a2.getJ())
                    .append(";");
        });
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        calendar.set(Calendar.HOUR_OF_DAY, 0);
//        calendar.set(Calendar.MINUTE, 0);
//        calendar.set(Calendar.SECOND, 0);
//        Date zero = calendar.getTime();
//
//        DateFormatUtils.format(new Date(),"yyyy-MM-dd");
//        System.out.println(DateFormatUtils.format(new Date(),"yyyy-MM-dd 00-00-00"));

    }
}

@Data
class a{
    public  double i= 100;
   public int j = 2;
   public b b1 = new b();
}

@Data
class b{
    public Long bb=1000L;
    public String bbb = "hi!";
}

class JsonDemos {


    private String couponBatchNumber = null;

    private String projectId = "1111";

    private String projectName = "guanyu";

    private Long startTime = new Date().getTime();


}