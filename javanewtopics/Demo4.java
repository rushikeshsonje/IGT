import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

class A {
    A() {
        Date d = new Date();
        System.out.println(d);
        
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
        
        LocalDate n = LocalDate.of(2015, 02, 23);
        System.out.println(n);
        
        LocalDate y = LocalDate.parse("2015-02-23");
        System.out.println(y);
        
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        
        System.out.println("Tomorrow is: " + tomorrow);
        
        DayOfWeek sunday = LocalDate.parse("2017-04-23").getDayOfWeek();
        int twelve = LocalDate.parse("2017-04-23").getDayOfMonth();
        
        System.out.println(sunday);
        System.out.println(twelve);
        
        boolean leapyear = LocalDate.now().isLeapYear();
        System.out.println(leapyear);
    }
}

class Demo4 {
    public static void main(String args[]) {
        A a = new A();
    }
}







