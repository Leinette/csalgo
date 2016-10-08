/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karatsuba1;
import java.util.Scanner;
public class Karatsuba1 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);      
        String x, y;
        int a, b, c, d, ac, ad, bc, bd, answer;
        System.out.print("Enter X: ");
        x = sc.nextLine();
        System.out.print("Enter Y: ");
        y = sc.nextLine();
        System.out.println("s: " + x + " y: " + y);
        a = Integer.parseInt(x.substring(0, 2));
        b = Integer.parseInt(x.substring(2, 4));
        c = Integer.parseInt(y.substring(0, 2));
        d = Integer.parseInt(y.substring(2, 4));
        System.out.println(a + " " + b + "     " + c + " " + d);
        
        ac = a*c;
        ad = b*d;
        bc = b*c;
        bd = b*d;
        answer = ((ac * 10000) + (ad+bc)*100) + bd;
        System.out.println("Answer: "+answer);
    }
    
}
