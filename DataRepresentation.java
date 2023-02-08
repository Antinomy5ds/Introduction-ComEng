import java.util.Scanner;

public class DataRepresentation {
    public static void main(String[] args) {

        String x, hex;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a binary : ");
        x = scn.nextLine();

        int decimal = Integer.parseInt(x, 2);
        hex = Integer.toHexString(decimal);
        int chr = Integer.parseInt(x, 2);
        int Natural = Integer.parseInt(x, 2);
        int sig = Integer.parseUnsignedInt(x, 2);
        if (x.charAt(0) == '1') {
            sig -= (1 << x.length());
        }

        System.out.println("Binary to Natural : " + Natural);

        System.out.println("Binary to Signed Integer : " + sig);

        System.out.println("Binary to Character : " + (char) chr);

        System.out.println("Binary to Hexadecimal : " + hex);

    }
}
