public class remove_duplicate_array {
    public static void main(String args[]){
        int[] arr={1,1,3};
        int[] new1= new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<count;j++){
                if(arr[i]==new1[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                new1[count]=arr[i];
                count++;
            }
        }
        
        for(int i=0;i<new1.length;i++){
            System.out.print(new1[i]+" ");
    }

    }
}
