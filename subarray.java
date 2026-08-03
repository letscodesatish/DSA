public class subarray {
    public static void subArray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarray: "+ts);
    }
    public static void main(String args[]){
        int[] number={1,3,5,2,6};
        subArray(number);
    }
}
