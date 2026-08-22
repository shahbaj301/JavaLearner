public class anticlockrotate {
 public static void main(String[] args) {

        int size = 5;
        int arr[] = {10, 20, 30, 40, 50};
        int d = 2;

        for(int i = 0; i < d; i++) {

            int temp = arr[0];

            for(int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[size - 1] = temp;
        }

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
