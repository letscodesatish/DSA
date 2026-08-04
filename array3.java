public class array3 {
    public static void maxSumArray(int number[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        int[] prefix=new int[number.length];
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+ number[i];
        }
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currsum=0;
                maxsum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        
    }
    // Kadane's Algorithm
    public static void kadaneAlgo(int number[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
        cs=cs+number[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
    }
    System.out.println("Max subarray sum is "+ms);
}
     public static void main(String args[]){
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        maxSumArray(arr);
        kadaneAlgo(arr);
     }
}
