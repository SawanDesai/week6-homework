import sun.plugin.util.ProgressMonitorAdapter;

public class Programme3 {
    int x = 50;   static int y = 100;
    public void myMethod1() {
        Programme3 la = new Programme3();

        System.out.println(x);
        System.out.println(la.y);
    }
    public static void myMethod2() {
        Programme3 ma = new Programme3();
        System.out.println(ma.x);
        System.out.println(y);

    }

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        obj.myMethod1();
        myMethod2();

    }


}

