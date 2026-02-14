package com.mycompany.pertemuan_1;
import java.math.BigInteger;
import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Nomor: ");
        String input = scan.next();
        
        try {
            BigInteger n = new BigInteger(input);
        
            long longMax = Long.MAX_VALUE;
            long longMin = Long.MIN_VALUE;
        
            // int a = 150;
        
            if(n.compareTo(BigInteger.valueOf(longMax)) <= 0 && 
            n.compareTo(BigInteger.valueOf(longMin)) >= 0) {
                long a = n.longValue();
            
                if(a <= 127 && a >= -128) {
                    System.out.println(a + " can be fitted in:");
                    System.out.println(" - byte");
                    System.out.println(" - int");
                } else if(a <= 32767 && a >= -32768) {
                    System.out.println(a + " can be fitted in:");
                    System.out.println(" - short");
                    System.out.println(" - int");
                } else if (a <= 2147483648L && a >= -2147483648L){
                    System.out.println(a + " can be fitted in:");
                    System.out.println(" - long");
                    System.out.println(" - int");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(input + " can’t be fitted anywhere");
        }
        scan.close();
    }
}
