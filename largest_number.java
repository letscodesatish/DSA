public class largest_number {
    public static int largest_num(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
               largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String arg[]){
    int[] arr={1,22,4,6,9};
    int greatest_num=largest_num(arr);
    System.out.println(greatest_num);
    }
}
