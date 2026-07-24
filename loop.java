import java.util.*;
public class loop {
    public static void main(String arg[]){
    //     for(int counter=0; counter<11;counter ++){
    //         System.out.print(counter+ " ");
    //     }

    //     int a=0;
    //     while(a<11){
    //         System.out.print(a+" ");
    //         a++;
    //     }

    //     do{
    //         System.out.print(a+" ");
    //         a++;
    //     }while(a<11);

    // Sum of n natural number
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter natural number: ");
    int n= sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
        sum=sum+i;
    }
    System.out.println(sum);
    }
}
