import java.util.Scanner;

public class BinaryConvert {
    public static void main(String[] args) {
        String type;
        String bin = "BINARY", oct = "OCTAL", dec = "DECIMAL", hex = "HEXADECIMAL";
        Scanner scan_bi = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String bi, oc, de;
        System.out.print("Choose a input type (Binary,Octal,Decimal,Hexadecimal) : ");
        type = scan.nextLine();

        String big = type.toUpperCase();
        if (big.equals(bin)) {
            System.out.print("Enter a Binary : ");
            bi = scan_bi.nextLine();
            System.out.print("Choose Type to Convert(Decimal,Octal,Hexadecimal) :");
            type = scan.nextLine();
            String big_type = type.toUpperCase();
            int decimal = Integer.parseInt(bi, 2);
            switch (big_type) {
                case "DECIMAL":
                    System.out.println("A Decimal of " + bi + " is " + decimal);
                    break;
                case "OCTAL":
                    String octal = Integer.toOctalString(decimal);
                    System.out.println("A Octal of " + bi + " is " + octal);
                    break;
                case "HEXADECIMAL":
                    String hexi = Integer.toHexString(decimal);
                    System.out.println("A Hexadecimal of " + bi + " is " + hexi.toUpperCase());
                    break;
                default:
                    System.out.println("It not MATCH");

            }
        } else if (big.equals(oct)) {
            System.out.print("Enter a Octal : ");
            bi = scan_bi.nextLine();
            System.out.print("Choose Type to Convert(Binary,Decimal,Hexadecimal) :");
            type = scan.nextLine();
            String big_type = type.toUpperCase();
            int oc_de = Integer.parseInt(bi, 8);
            switch (big_type) {
                case "DECIMAL":
                    System.out.println("A Decimal of " + bi + " is " + oc_de);
                    break;
                case "BINARY":
                    String oc_bi = Integer.toBinaryString(oc_de);
                    System.out.println("A Binary of " + bi + " is " + oc_bi);
                    break;
                case "HEXADECIMAL":
                    String oc_hex = Integer.toHexString(oc_de);
                    System.out.println("A Hexadecimal of " + bi + " is " + oc_hex.toUpperCase());
                    break;
                default:
                    System.out.println("Try again :)");
            }
        } else if (big.equals(dec)) {
            System.out.print("Enter a Decimal :");
            bi = scan_bi.nextLine();
            System.out.print("Choose Type to Covert(Binary,Octal,Hexadecimal) : ");
            type = scan.nextLine();
            String big_type = type.toUpperCase();
            int de_bi = Integer.parseInt(bi);
            switch (big_type) {
                case "BINARY":
                    String bide = Integer.toBinaryString(de_bi);
                    System.out.println("A Binary of " + bi + " is " + bide);
                    break;
                case "OCTAL":
                    String bio = Integer.toOctalString(de_bi);
                    System.out.println("A Octal of " + bi + " is " + bio);
                    break;
                case "HEXADECIMAL":
                    String bihe = Integer.toHexString(de_bi);
                    System.out.println("A Hexadecimal of " + bi + " is " + bihe.toUpperCase());
                    break;
                default:
                    System.out.println("Nope :)");

            }
        } else if (big.equals(hex)) {
            System.out.print("Enter a Hexadecimal :");
            bi = scan_bi.nextLine();
            System.out.print("Choose Type to Convert(ฺBinary,Octal,Decimal) : ");
            type = scan.nextLine();
            String big_type = type.toUpperCase();
            int he_de = Integer.parseInt(bi);
            switch (big_type) {
                case "BINARY":
                    String hexbi = Integer.toBinaryString(he_de);
                    System.out.println("A Binary of " + bi + " is " + hexbi);
                    break;
                case "OCTAL":
                    String hexoc = Integer.toOctalString(he_de);
                    System.out.println("A Octal of " + bi + " is " + hexoc);
                    break;
                case "DECIMAL":
                    int hexde = Integer.parseInt(bi, 16);
                    System.out.println("A Decimal of " + bi + " is " + hexde);
                    break;
                default:
                    System.out.println("It not found ;-;, See ya ");
                    break;
            }
        } else {
            System.out.println("Have you found it Have a nice day");
        }
    }
}
