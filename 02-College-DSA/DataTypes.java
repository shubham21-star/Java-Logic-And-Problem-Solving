public class DataTypes {

    
    public static void main(String[] args) {

        // Integer types
        byte a = 10;
        short b = 1000;
        int c = 50000;
        long d = 100000L;

        // Decimal types
        float e = 10.5f;
        double f = 20.55;

        // Character
        char g = 'A';

        // Boolean
        boolean h = true;

        // String
        String name = "Shubham";

        System.out.println("Byte = " + a);
        System.out.println("Short = " + b);
        System.out.println("Int = " + c);
        System.out.println("Long = " + d);
        System.out.println("Float = " + e);
        System.out.println("Double = " + f);
        System.out.println("Character = " + g);
        System.out.println("Boolean = " + h);
        System.out.println("String = " + name);

        System.out.println(" Sum: " + (a + b));
        System.out.println(" Difference: " + (c - d));
        System.out.println(" Product: " + (a * b));
        System.out.println(" Division: " + (c / d));
        System.out.println(" Modulus: " + (c % d));

        System.out.println(" post-increment: " + (a++));
        System.out.println(" pre-increment: " + (++a));

        System.out.println(" Greater & Equal: " + (a <= b));
        System.out.println(" Smaller & Equal: " + (c >= d));
        System.out.println(" Only Equal: " + (a == b));
        System.out.println(" Not Equal: " + (c != d));
        System.out.println(" Only Greater: " + (c > d));
        System.out.println(" Only Smaller: " + (c < d));


    }
}           