import java.util.*;

public class array {
    public static void main(String args[]){
        // int [] marks= new int[3];
        // marks[0]=98;
        // marks[1]=99;
        // marks[2]=97;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size= sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter " + size+" Elements");
        for(int i=0;i<size;i++){
            marks[i]= sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int num= sc.nextInt();
        for(int i=0;i<marks.length;i++){
            if(num== marks[i]){
            System.out.println(i);
            }
            else{
                System.out.println("Num not found.");
                break;
            }
        }

    }
    
}
