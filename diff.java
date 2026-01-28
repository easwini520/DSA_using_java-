public class DataTypesInfo {
    public static void main(String[] args) {
        System.out.println("Java Data Types - Size and Range\n");
        
        System.out.println("byte:");
        System.out.println("  Size: " + Byte.SIZE + " bits");
        System.out.println("  Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        
        System.out.println("\nshort:");
        System.out.println("  Size: " + Short.SIZE + " bits");
        System.out.println("  Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        
        System.out.println("\nint:");
        System.out.println("  Size: " + Integer.SIZE + " bits");
        System.out.println("  Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        
        System.out.println("\nlong:");
        System.out.println("  Size: " + Long.SIZE + " bits");
        System.out.println("  Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        
        System.out.println("\nfloat:");
        System.out.println("  Size: " + Float.SIZE + " bits");
        System.out.println("  Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        
        System.out.println("\ndouble:");
        System.out.println("  Size: " + Double.SIZE + " bits");
        System.out.println("  Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        
        System.out.println("\nchar:");
        System.out.println("  Size: " + Character.SIZE + " bits");
        System.out.println("  Range: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
        
        System.out.println("\nboolean:");
        System.out.println("  Size: Not precisely defined (JVM dependent)");
        System.out.println("  Values: true or false");
    }
}