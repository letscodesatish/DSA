public class pair_of_array {
    public static void pairArray(int arr[]){
        int tol=0;
        for(int i=0;i<arr.length;i++){
            int number=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tol++;
            }
            System.out.println();
        }
        System.out.println(tol);
    }
    public static void main(String args[]){
        int[] number={2,4,6,8,10};
        pairArray(number);
    }
}
