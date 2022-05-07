package wrappers;

/**
 * Wrapper классы (Практика)
 */

public class WrapperTest {


    private static Double double3;

    public static void main(String[] args) {

        // 2.1

        Integer i1 = 15;
        Integer i2 = Integer.valueOf(15);
        Integer i3 = new Integer(15);
        Integer i4 = Integer.parseInt("15");

        // 3 - 3.2

        Double d = 15.1;
        byte b = d.byteValue();
        System.out.println(b);
        short s = d.shortValue();
        System.out.println(s);
        int i = d.intValue();
        System.out.println(i);
        long l = d.longValue();
        System.out.println(l);
        float f = d.floatValue();
        System.out.println(f);

        // 4 - 4.5

        Double d1 = new Double(0.8d / 0.0);
        System.out.println(d1 + ":" + d1.isNaN());
        Double d2 = new Double(0.7d / 0.0);
        System.out.println(Double.POSITIVE_INFINITY);

        Double double1 = 0.0;
        Double double2;
        Double nanValue = double1 / 0.0;
        Double infinityValue = double1 / double1;
        System.out.println("NanValue:" + nanValue);
        System.out.println("InfinityValue:" + infinityValue);

        if (Double.isNaN(double1)) double1 = double3;
        {
            System.out.println("Переменная " + double3 + " = NaN");
        }

        if (Double.isInfinite(double1)) double1 = double3;
        {
            System.out.println("Переменная " + double3 + " = Identify");
        }

        // 5 -5.2

        Long l1 = 120L;
        Long l2 = 120L;
        boolean rez = l1 == l2;
        System.out.println(rez);
        l1 = 1200L;
        l2 = 1200L;
        boolean rez2 = l1 == l2;
        System.out.println(rez2);


    }


}
