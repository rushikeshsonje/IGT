class emp {
    class Insert {
        Insert() {
            System.out.println("Insert Class..");
        }
        void abc() {
            System.out.println("Insert class abc method");
        }
    }
    class Display {
        Display() {
            System.out.println("Display Class..");
        }
        void xyz() {
            System.out.println("Display class xyz method");
        }
    }
}

class Demo2 {
    public static void main(String args[]) {
        System.out.println("Hi demo2 ");
        emp e = new emp();
        emp.Insert ins = e.new Insert();
        ins.abc();
    }
}







