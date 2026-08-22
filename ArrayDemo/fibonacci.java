public class fibonacci {
    public static void main(String[] args) {
    int n=10;
    int arr[]=new int[n];
    // arr[0]=0;
    // arr[1]=1;
    // for(int i=2;i<n;i++){
    //     arr[i]=arr[i-1]+arr[i-2];

    // }
    // for(int j=0;j<n;j++){
    //     System.out.print(arr[j]+" ");
    // }
        
    int a=0;
    int b=1;
    int sum=0;
    for(int i=0;i<n;i++){
        arr[i]=b;
        sum=a+b;
        a=b;
        b=sum;
        

    }
    for(int j=0;j<n;j++){
        
        System.out.print(arr[j]+" ");
    }

}

    
}
