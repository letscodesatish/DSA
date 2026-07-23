import java.util.*;
public class calculator {
    public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter num 1: ");
    int a= sc.nextInt();
    System.out.print("Enter num 2: ");
    int b= sc.nextInt();
    System.out.print("1.Add\n2.Sub\n3.Multiplication\n4.Divide\nEnter operation: ");
    int c= sc.nextInt();

    switch(c){
        case 1: System.out.println(a+b);
        break;
        case 2: System.out.println(a-b);
        break;
        case 3: System.out.println(a*b);
        break;
        case 4: System.out.println(a/b);
        break;
        default: System.out.println("Invalid Operation");
        
    }
    }
}
