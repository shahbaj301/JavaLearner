public class rotatearray {
    public static void main(String[] args) {
        int size=5;
        int arr[]={10,20,30,40,50};
        int d=2;


        for(int i=0;i<d;i++){
            int temp=arr[size-1];

        for(int j=size-1;j>0;j--){
            arr[j]=arr[j-1];

        }
        arr[0]=temp;

        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        


    }
    
}
