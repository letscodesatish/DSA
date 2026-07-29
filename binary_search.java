public class binary_search {
    public static int binary_search_array(int arr[], int key){
        int start=0 , end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={1,4,89,2,80,2};
        int key=890;
        int found=binary_search_array(arr,key);
        System.out.println("The num at: "+found);

    }
}
