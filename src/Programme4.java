public class Programme4 {
    int a = 10;     int b = 20;
    static String c = "Sawan";     static String d = "Desai";

    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        obj.myMethod1();
        myMethod2();
    }
    void myMethod1() {
        Programme4 mn = new Programme4();
        Programme4 op = new Programme4();
        System.out.println(a);
        System.out.println(b);
        System.out.println(mn.c);
        System.out.println(op.d);
    }
    public static void myMethod2() {
        Programme4 qr = new Programme4();
        Programme4 st = new Programme4();
        System.out.println(qr.a);
        System.out.println(st.b);
        System.out.println(c);
        System.out.println(d);
    }
}

