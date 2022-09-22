public class methodoverloading {
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        double num1 = plusMethod(5,5.6);
        System.out.println("num1 = " + num1);
        double num2 = plusMethod(5.6,5);
        System.out.println("num2 = " + num2);
        int num3 = plusMethod(5,5);
        System.out.println("num3 = " + num3);
        double num4 = plusMethod(5.6,5.6);
        System.out.println("num4 = " + num4);
    }
}
