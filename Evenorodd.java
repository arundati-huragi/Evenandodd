package CIE;
import java.util.Scanner;

public class Evenorodd {
        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
           
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            System.out.println("this is master branch");
            
            
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
                
            }
           
            scanner.close();
        }
    }

