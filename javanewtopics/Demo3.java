import java.util.*;
class A {
    A() {
	// Generics means Only allowing single data type value to arraylist here integer
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(100);
        a1.add(300);
        a1.add(556);
        a1.add(304530);
        a1.add(323400);
        a1.add(34);
        
        Iterator i = a1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
	Date d = new Date();
	System.out.println(d);
    }
}

class Demo3 {
    public static void main(String args[]) {
        A a = new A();
    }
}







