public class smallest_number_array {
    public static int smallest_num(int arr[]){
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int[] arr={23,9,0,1,-7};
        int smallest_num=smallest_num(arr);
        System.out.println(smallest_num);
    }
}
