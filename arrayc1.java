public class arrayc1 {
    public static void maxSumArray(int arr[]){
        int countsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                countsum=0;
                int end=j;
                for(int k=start;k<=end;k++){
                        countsum +=arr[k]; 
                }
                System.out.println(countsum);
                if(maxsum<countsum){
                    maxsum=countsum;
                }
            }
        }
        System.out.println("Max sum subarray: "+maxsum);
    }
    public static void main(String args[]){
        int[] number={1,-2,6,-1,3};
        maxSumArray(number); 
    }
}
