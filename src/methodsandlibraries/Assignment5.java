package methodsandlibraries;
import java.util.Scanner;
public class Assignment5 {
 public static void main(String[] args){
     consumption( 1000);
    }
    public static String consumption(int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter consumption :");
         number = scanner.nextInt();
     String result="";
     if  (number>=500 && number<=1000){
         result="Good";
     }else if(number>=1000 && number>=1500) {
         result = "Not bad";
     }
     else {
         result= "Bad";
     }
     return result;
    }
}
