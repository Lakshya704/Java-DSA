public class _12Sorting {
    //BUBBLE SORT
    public static void BubbleSort(int number[]) {
        for (int turn = 0; turn < number.length - 1; turn++) {
            for (int i = 0; i < number.length - 1 - turn; i++) {
                if (number[i] > number[i + 1]) {
                    int temp = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = temp;
                }
            }
        }
    }

    //SELECTION SORT
    public static void SelectionSort(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[min] < number[j]) {
                    min = j;
                }
            }
            int temp = number[min];
            number[min] = number[i];
            number[i] = temp;
        }
    }

    //INSERTION SORT
    public static void insertionSort(int number[]) {
        for (int i = 1; i < number.length; i++) {
            int curr = number[i];
            int prev = i - 1;
            //finding the correct position to insert
            while (prev >= 0 && number[prev] < curr) {
                number[prev + 1] = number[prev];
                prev--;
            }
            //inserting the element
            number[prev + 1] = curr;
        }
    }

    //COUNTING SORT
    public static void countingSort(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            largest = Math.max(largest, num[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void PrintArr(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = {3, 5, 4, 2, 1};
        int num[] = {1, 4, 1, 5, 2, 6, 3, 3, 7};
//        BubbleSort(number);
//        SelectionSort(number);
//        insertionSort(number);
        countingSort(num);
        PrintArr(num);
    }
}
