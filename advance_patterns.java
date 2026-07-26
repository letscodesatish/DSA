public class advance_patterns {
    public static void main(String args[]){
        // // Butterfly pattern
        // int n=4;
        // // Upper half
        // for(int i=1;i<=n;i++){
        //     // 1st part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     // Space
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     // 2nd part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // Lower half
        // for(int i=n;i>=1;i--){
        //     // 1st part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     // Space 
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     // 2nd part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Solid rhombus pattern
        // int n=5;
        // for(int i=n; i>=1;i--){
        //     for(int j=i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     System.out.print("*****");
        //     System.out.println(); 
        // }
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(); 
        // }
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println(); 
        // }
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println(); 
        // }

        // Diamond Pattern
        int n=4;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        for(int i=n; i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println(); 
        }


    }
}
