import java.util.Scanner;
import java.util.*;
public class Findform {
    Scanner scanner = new Scanner(System.in);
    public void r_and_q(){
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        int q = a/b;
        int r = a+(-b*q);
        System.out.println("------------------------------");
        System.out.println("Q--->    "+q+"\nR--->    "+r);
        System.out.println("------------------------------");
    }
    public void gcd(){
        System.out.println("please enter a: ");
        int a = scanner.nextInt();
        System.out.println("please enter b: ");
        int b = scanner.nextInt();
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; ++i) {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        int lcm = (a * b) / gcd;
        System.out.println("------------------------------");
        System.out.println("GCD--->     "+(a*b)/lcm);
        System.out.println("------------------------------");
    }
    public void X_X2(){
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        int D = ((b*b)+(-4*a*c));
        double powD = Math.sqrt(D);
        double x1 = ((-1*b)+(powD))/(2*a);
        double x2 = ((-1*b)-(powD))/(2*a);
        if(D<0){
            System.out.println("Error D<0");
        }
        else{
            System.out.println("X1------>          "+x1);
            System.out.println("X2------>          "+x2);
        }
    }
    public void TrueFalse(){
        System.out.println("Enter a(T or F): ");
        String a = scanner.next();
        System.out.println("Enter b(T or F): ");
        String b = scanner.next();
        System.out.println("Enter the operation(\"and\",\"or\",\"then\"): ");
        String c = scanner.next();
        String result = null;
        switch (c){
            case "and":
                if(a.equals("T")&&b.equals("T")){
                    result="True";
                }
                else if(a.equals("T")&&b.equals("F")){
                    result="False";
                }
                else if(a.equals("F")&&b.equals("T")){
                    result="False";
                }
                else if(a.equals("F")&&b.equals("F")) {
                    result = "False";
                }
            break;
            case "or":
                if(a.equals("T")&&b.equals("T")){
                    result="True";
                }
                else if(a.equals("T")&&b.equals("F")){
                    result="True";
                }
                else if(a.equals("F")&&b.equals("T")){
                    result="True";
                }
                else if(a.equals("F")&&b.equals("F")) {
                    result = "False";
                }
            break;
            case "then":
                if(a.equals("T")&&b.equals("T")){
                    result="True";
                }
                else if(a.equals("T")&&b.equals("F")){
                    result="False";
                }
                else if(a.equals("F")&&b.equals("T")){
                    result="True";
                }
                else if(a.equals("F")&&b.equals("F")) {
                    result = "True";
                }
            break;
        }
        System.out.println("|Result------>          "+result);
    }
}