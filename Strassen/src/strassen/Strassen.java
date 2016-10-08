package strassen;

import java.util.Scanner;

public class Strassen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c00, c01, c10, c11, a00, a01, a10, a11, b00, b01, b10, b11, m1, m2, m3, m4, m5, m6, m7;

        System.out.print("enter value for a00:");
        a00 = sc.nextInt();
        System.out.print("enter value for a01:");
        a01 = sc.nextInt();
        System.out.print("enter value for a10:");
        a10 = sc.nextInt();
        System.out.print("enter value for a11:");
        a11 = sc.nextInt();
        System.out.print("enter value for b00:");
        b00 = sc.nextInt();
        System.out.print("enter value for b01:");
        b01 = sc.nextInt();
        System.out.print("enter value for b10:");
        b10 = sc.nextInt();
        System.out.print("enter value for b11:");
        b11 = sc.nextInt();
        
        System.out.println(a00 +"     " + a01 + "       " + b00 +"     " + b01);
        System.out.println(a10 +"     " + a11 + "       " + b10 +"     " + b11 + "\n\n");

        m1 = (a00 + a11) * (b00 + b11);
        m2 = (a10 + a11) * b00;
        m3 = a00 * (b01 - b11);
        m4 = a11 * (b10 - b00);
        m5 = (a00 + a01) * b11;
        m6 = (a10 - a00) * (b00 + b01);
        m7 = (a01 - a11) * (b10 + b11);
        
        c00 = m1 +m4 -m5 +m7;
        c10 = m2+m4;
        c01 = m3+m5;
        c11 = m1 + m3 - m2 + m6;
        
        System.out.println(c00 +"     " + c01 );
        System.out.println(c10 +"     " + c11);
    }

}
