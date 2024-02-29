import java.util.*;

public class _10Array {
    //Update Marks function
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    //Linear Search
    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static String Lstring(String drink[], String hard) {
        for (int i = 0; i < drink.length; i++) {
            if (drink[i] == hard) {
                return "1";
            }
        }
        return "NF";
    }

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;//-Infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;//-Infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    //Binary Search
    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //Reverse of an array
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    //Pairs in Array
    public static void pair(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    //Printing subarrays
    public static void printSubArr(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {//here i=start & j=end
                    System.out.print("{" + numbers[k] + "}");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays  : " + ts);
    }

    //Printing the sum of the largest subarray
    public static void printMaxSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {//here i=start & j=end
                    currSum += numbers[k];
                }
                System.out.print("{" + currSum + "}");
                System.out.println();
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum of an Sub-Array is : " + maxSum);
    }

    //Prefix Max SubArray Sum
    public static void printPrefixSum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        //Calculate prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.print("{" + currSum + "}");
                System.out.println();
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum of an Sub-Array is : " + maxSum);
    }

    //KADANCE'S ALGORITHM
    public static void kadances(int num1[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num1.length; i++) {
            cs += num1[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our maximum sum is : " + ms);
    }

    //Trapping Rainwater

    public static void main(String[] args) {
//        int marks[] = {99, 98, 97, 95};
//        update(marks);
//        for (int i = 0; i < marks.length; i++) {
//            System.out.print(marks[i] + " ");
//        }
//        System.out.println();

        //Linear Search
        int numbers[] = {2, 4, 6, 8, 10};
//        int key = 6;
//        int index = LinearSearch(numbers, key);
//        if (index == -1) {
//            System.out.println("KEY NOT FOUND");
//        } else {
//            System.out.println("Your key of Linear Search is : " + index);
//        }
//
//        //Binary Search
//        System.out.println("Your key of Binary Search is : " + BinarySearch(numbers, key));
//
//        //Reverse of an array
////        reverse(numbers);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();

//        String drink[] = {"beer", "Rum", "Coke", "Vodka"};
//        String hard = "beer";
//        String soft = Lstring(drink, hard);
//        if (soft == "1") {
//            System.out.println("NOT FOUND STRING");
//        } else if (soft == "NF") {
//            System.out.println("FOUND THE STRING : " + soft);
//        }

        //GET LARGEST AND SHORTEST
//        int large = getLargest(numbers);
//        System.out.println("Largest Number is an array is : " + large);
//        int small = getSmallest(numbers);
//        System.out.println("Smallest Number is an array is : " + small);

        //PAIRS OF ARRAY
//        pair(numbers);

        //Sub-Array
//        printSubArr(numbers);

        //Max Subarray
//        printMaxSum(numbers);

        //MAX SubArray Prefix Sum
//        int num[] = {1, -2, 6, -1, 3};
//        printPrefixSum(num);

        //Kadance's Algorithm
        int num1[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadances(num1);
    }
}
