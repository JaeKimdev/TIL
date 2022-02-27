package variable_003;

//Question
//Implement a code that outputs the byte size and bit size of Java's primitive type.
//Implemented only for integer and letter types.
//At this time, find the maximum and minimum values of each type and print them out together.
public class Variable_003 {

    public static void main(String[] args) {
        System.out.println("byte :" + Byte.BYTES + "(Byte) " + "--> " + Byte.SIZE + " (Bit) " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short :" + Short.BYTES + "(Byte) " + "--> " + Short.SIZE + " (Bit) " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int :" + Integer.BYTES + "(Byte) " + "--> " + Integer.SIZE + " (Bit) " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long :" + Long.BYTES + "(Byte) " + "--> " + Long.SIZE + " (Bit) " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("char :" + Character.BYTES + "(Byte) " + "--> " + Character.SIZE + " (Bit) " + (int) Character.MIN_VALUE + " ~ " + (int) Character.MAX_VALUE);
    }

}
