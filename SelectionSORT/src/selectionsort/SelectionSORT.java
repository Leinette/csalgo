package selectionsort;

public class SelectionSORT {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println(arr[i]); 
            }
        }
    }
}