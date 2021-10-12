package one.innovation.digital.types.wrappers;

public class Wrappers {
    public static void main(String[] args) {
        // Autoboxing
        // byte
        Byte b = 127;
        Byte b2 = -128;
        Byte nullByte = null;
        // char
        Character c = 'A';
        Character c2 = 15;
        // short
        Short s = 32767;
        Short s2 = -32768;
        // int
        Integer i = 2147483647;
        Integer i2 = -2147483647;
        // long
        Long l1 = 9223372036854775807L;
        Long l2 = -9223372036854775808L;
        // float
        Float f; // 32 bits 3.402.823,5 E+38
        Float f1 = 65f;
        Float f2 = 65.0f;
        Float f3 = -0.5f; // 1.4 E-45
        // double
        Double d; // 64 bits
        Double d1 = 10.2456; // 4.9 E-324
        // boolean
        Boolean boo = false; // default false
        Boolean boo2 = true;
        //
        Boolean boo3 = Boolean.getBoolean("false");
        Boolean boo4 = Boolean.valueOf("true");
    }
}
