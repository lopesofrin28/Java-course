
package tutorial1;

public class Tutorial32_TypeCasting {
    public static void main(String[] args) {
        byte byteValue=20;
        short shortValue=55;
        int intValue=888;
        long longValue=23355;
        
        float floatValue=8834.3f;
        float floatValue2=(float)99.3;
        double doubleValue=32.4;
        
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);
        
        intValue=(int)longValue;
        System.out.println(intValue);
        
        doubleValue=intValue;
        System.out.println(doubleValue);
        
        intValue=(int)floatValue;
        System.out.println(intValue);

        //The following won't work as we expect it to!
        //128 is too big for a byte.
        byteValue=(byte)128;
        System.out.println(byteValue);
        
//        Math.round(intValue);
//        System.out.println(intValue);


//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//        
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);
//        
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
    }
}
