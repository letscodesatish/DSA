import java.util.*;
public class javabasics {
    public static void main(String args[]){
        // System.out.print("Hello World");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // Sum of two number
        // Scanner sc= new Scanner(System.in);
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int sum= a+b;
        // System.out.println(sum);

        // if-else statements
        Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your age: ");
    //     int age= sc.nextInt();
    //     if(age>18){
    //         System.out.println("Eligible for driving.");
    //     }
    //     else{
    //         System.out.println("Not Eligible for driving.");
    //     }
        
    // Check odd and even
    // System.out.print("Enter a number: ");
    // int a = sc.nextInt();
    // if(a%2==0){
    //     System.out.println("Even");
    // }
    // else{
    //     System.out.println("Odd");
    // }
    
    System.out.print("Enter two number: ");
    // int a= sc.nextInt();
    // int b= sc.nextInt();
    // if(a==b){
    //     System.out.println("Equal");
    // }
    // else if(a>b){
    //         System.out.println(a +" is greater than " + b);
    //     }
    // else{
    //         System.out.println(b +" is greater than " + a);
    //     }

    int button= sc.nextInt();
    // if(button==1){
    //     System.out.println("Hello");
    // }
    // else if(button==2){
    //     System.out.println("Namaste");
    // }
    // else if (button==3){
    //     System.out.println("Bonjour");
    // }
    // else{
    //     System.out.print("Invalid Button");
    // }
    switch(button){
        case 1: System.out.println("Hello");
                break;
        case 2: System.out.println("Namaste");
                break;
        case 3: System.out.println("Bonjour");
                break;
        default: System.out.println("Invalid Button");
                
    }


    }
}
