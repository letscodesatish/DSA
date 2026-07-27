import java.util.*;
public class twoDarray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row= sc.nextInt();
        System.out.print("Enter no. of col: ");
        int col= sc.nextInt();
        int [][] matrix=new int[row][col]; 

    // input
    // row
    for(int i=0;i<row;i++){
        // column
        for(int j=0;j<col;j++){
            System.out.print("Enter element at "+i+j+": ");
            matrix[i][j]= sc.nextInt();
        }
    }

    // Search a number
    System.out.println("Enter the num to search: ");
    int num= sc.nextInt(); 
    // output
    // row
    for(int i=0;i<row;i++){
        // column
        for(int j=0;j<col;j++){
            if(num==matrix[i][j]){
               System.out.print("Num at: "+i+j+" Index");
            }
            
    }
        System.out.println();
    }
    }
}
