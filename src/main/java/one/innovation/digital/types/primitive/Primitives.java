package one.innovation.digital.types.primitive;

public class Primitives {
    public static void main(String[] args){
        // Integers
        // byte nullByte = null; // not accepted
        byte b; // 8 bits
        byte b1 = 127;
        byte b2 = -127;
        // byte b3 = 129; // not accepted: too large
        char c; // 16 bits
        char c1 = 'A';
        char c2 = 15;
        // char c3 = 'AA'; // not accepted: too large
        // char c4 = -100; // Required char...
        short s; // 16 bits
        short s1 = 32767;
        short s2 = -32768;
        // short s3 = 32769; // not accepted: too large
        int i; // 32 bits
        int i2 = 2147483647;
        int i3 = -2147483648;
        // int i3 = 2147483649; // not accepted: too large
        long l; // 64 bits
        long l1 = 9223372036854775807L;
        long l2 = -92233720543775808L;
        // long l3 = 9223372036854775808L; // not accepted: too large
        // Floating Point (Float)
        float f; // 32 bits 3.402.823,5 E+38
        float f1 = 65f;
        float f2 = 65.0f;
        float f3 = -0.5f; // 1.4 E-45

        double d; // 64 bits
        double d1 = 10.2456; // 4.9 E-324
        // Boolean
        boolean boo; // default false
        boolean boo2 = true;
        // boolean boo3 = 'true'; //
        // boolean boo4 = 'false'; //
        // Reserved words
        // void v; // invalid

    }
}
