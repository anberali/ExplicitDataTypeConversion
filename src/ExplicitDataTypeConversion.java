public class ExplicitDataTypeConversion {
    public static void main(String[] args) {

        double a = 50.503;
        System.out.println("Double Representation:" + a);

        float f = (float) a;
        System.out.println("Float Representation:" + f);

        long b = (long) f;
        System.out.println("Long Representation:" + b);

        int c = (int) b;
        System.out.println("Int Representation:" + c);
    }
}