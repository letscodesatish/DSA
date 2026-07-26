import java.util.*;
public class pattens {
    public static void main(String args[]){
        int n= 5;
        // int m=5;
        // for(int i=0; i<n;i++){
        //     for(int j=0;j<5;j++){
        //     System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //     if(i==1 || i==4 || j==1 || j==5){
        //     System.out.print("*");
        //     }
        //     else{
        //         System.out.print(" ");
        //     }
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // int c=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(c+" ");
        //         c++;
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int c= i+j;
                if(c%2 ==0){
                System.out.print("1"+" ");
                }  
                else{
                    System.out.print("0"+ " ");
                }
            }
            System.out.println();
        }
        


        }
    }

