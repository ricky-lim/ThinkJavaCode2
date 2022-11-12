public class MultAdd {
    public static void main(String[] args) {
        multadd(1.0, 2.0, 3.0);

        double a1 = Math.sin(Math.PI / 4);
        double b1 = Math.cos(Math.PI / 4);
        double c1 = 0.5;
        multadd(a1, b1, c1);

        double a2 = Math.log(10);
        double b2 = Math.log(20);
        double c2 = 1.0;
        multadd(a2, b2, c2);

        expSum(1);
    }

    public static void multadd(double a, double b, double c){
        double result = a * b + c;
        System.out.println(result);
    }

    public static void expSum(double x){
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1 - b);
        multadd(a, b , c);
    }
}
