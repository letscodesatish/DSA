public class arrayc2 {
    public static void maxSumArray(int number[]){
        int[] prefix=new int[number.length];
        prefix[0]=number[0];
        int maxSum= Integer.MIN_VALUE;
        int currsum=0;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currsum=0;
                currsum= start==0 ? prefix[end]: prefix[end]- prefix[start-1];
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }

        }
        System.out.println(maxSum);
    }
    public static void main(String args[]){
        int[] arr={1,-2,6,-1,3};
        maxSumArray(arr);
    }
}
