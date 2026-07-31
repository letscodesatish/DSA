public class array_reverse {
    public static void reverse(int number[]){
        int first=0 , last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        } 
    }
    public static void main(String args[]){
        int[] arr={2,5,7,1,9};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
