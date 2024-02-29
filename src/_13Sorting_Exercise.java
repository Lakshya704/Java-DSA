public class _13Sorting_Exercise {
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 1, 8, 7, 4, 5, 3, 1};
        bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array : " + arr[i]);
        }
    }
}
