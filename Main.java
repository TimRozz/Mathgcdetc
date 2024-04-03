import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Findform findform = new Findform();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find answer for all of your tasks");
        System.out.println();
        while(true){
            System.out.println("gcd,rq,xx2,TrueFalse,EXIT");
            String you = scanner.next();
            if(you.equals("gcd")) {findform.gcd();}
            else if(you.equals("rq")){findform.r_and_q();}
            else if(you.equals("xx2")){findform.X_X2();}
            else if(you.equals("TrueFalse")){findform.TrueFalse();}
            else if(you.equals("EXIT")){break;}
            else{
                System.out.println("Good");
            }
        }
    }
}