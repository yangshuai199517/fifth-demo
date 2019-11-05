package fifth_demo.io;

import lombok.Data;
import org.apache.commons.lang3.time.DateUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class TextFileTest {
    public static void main(String[] args){

        System.out.println(new Date());
        System.out.println( LocalDate.now());

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker",750000L,1987,12,15);
        staff[1] = new Employee("Hary Hacker",750000L,1988,10,1);
        staff[2] = new Employee("Tony Tester",750000L,1990,3,15);
        //save all emplyees in  the file emplyee.dat
        try(PrintWriter out = new PrintWriter("./src/main/resources/employee.dat","utf-8")  ) {
                writeData(staff,out);
        }catch (java.io.IOException e){e.printStackTrace();}

        try(Scanner in = new Scanner(new FileInputStream("./src/main/resources/employee.dat"))){
            Employee[] newstaff = readData(in);
            for (Employee e: newstaff){
                System.out.println(e);

        }

        }catch (java.io.IOException e){e.printStackTrace();}

    }
    private static void writeData(Employee[] employees, PrintWriter out) throws IOException {
        out.println(employees.length);
        for(Employee e:employees){writeEmployee(out,e);}
    }
    private static Employee[] readData(Scanner in ){
        int n = in.nextInt();
        in.nextLine();
        Employee[] employees = new Employee[n];
        for(int i=0;i<n;i++){
            employees[i] = readEmployee(in);
        }
        return employees;
    }
    public static void writeEmployee(PrintWriter out,Employee e){
        out.println(e.getName()+"|"+e.getSalary()+"|"+e.getDate());
    }
    public static Employee readEmployee(Scanner in){
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        Long salary = Long.parseLong(tokens[1]);
        LocalDate dates  = LocalDate.parse(tokens[2]);
        int year = dates.getYear();
        int month = dates.getMonthValue();
        int day = dates.getDayOfMonth();
        return new Employee(name,salary,year,month,day);

    }
}

@Data
class Employee{
    private String name;
    private Long salary;
    private LocalDate date ;
    public Employee(String name, Long salary,int year,int month,int day){
        this.name = name;
        this.salary = salary;

        date = LocalDate.of(year,month,day);


    }
//    public void setYear(int year){
//        this.date.setYear(year);
//    }
//    public void setMonth(int month){
//        this.date.setMonth(month);
//    }
//    public void setDay(int day){
//        this.date.setDay(day);
//    }

}

//@Data
//class Dates{
//    private int year;
//    private int day;
//    private int month;
//
//    public Dates parseDate(String s){
//        Dates d = new Dates();
//        d.setYear(1);
//return d;
//
//    }
//}