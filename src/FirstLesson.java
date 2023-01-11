import java.util.Scanner;

public class FirstLesson {
    public void variables(){
        byte varByte = 12;
        System.out.println("byte: " + varByte);
        short varShort = 3245;
        System.out.println("short: " + varShort);
        int vatInt = 41251553;
        System.out.println("int: " + vatInt);
        long varLong = 75463548523523528L;
        System.out.println("long: " + varLong);
        float varFloat = 5.12F;
        System.out.println("float: " + varFloat);
        double varDouble = 3.6234543624D;
        System.out.println("double: " + varDouble);
        boolean varBoolean = true;
        System.out.println("true: " + varBoolean);
        char varChar = 'A';
        System.out.println("char: " + varChar);
    }

    public void stringScanner(){
        System.out.println("Enter the text (min 8 chars):");
        Scanner stringScanner = new Scanner(System.in);
        String enterTheText = stringScanner.nextLine();
        int stringLength = enterTheText.length();
        System.out.println("length: " + stringLength);
        boolean stringIsEmpty = enterTheText.isEmpty();
        System.out.println("isEmpty: " + stringIsEmpty);
        char stringCharAt = enterTheText.charAt(7);
        System.out.println("charAt(7): " + stringCharAt);
        boolean stringStartsWith = enterTheText.startsWith("This");
        System.out.println("startsWith('This'): " + stringStartsWith);
        boolean stringEndsWith = enterTheText.endsWith("mine");
        System.out.println("endsWith('mine'): " + stringEndsWith);
        boolean stringContains = enterTheText.contains("is");
        System.out.println("contains('is'): " + stringContains);
        String stringConcat = enterTheText.concat(". The end");
        System.out.println("concat: " + stringConcat);
        String stringReplace = enterTheText.replace('i', 'a');
        System.out.println("replace: " + stringReplace);
        String stringToLowerCase = enterTheText.toLowerCase();
        System.out.println("toLowerCase: " + stringToLowerCase);
    }
}
