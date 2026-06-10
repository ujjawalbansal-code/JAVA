import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    static void main() {
        Scanner in = new Scanner(System.in);

//        Arrays of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 5;
        arr[3] = 405;
        arr[4] = 86;
        // [23,45,5,405,86]
        System.out.println(arr[3]);

//        input using for loops
        for (int i =0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

//        for each
        for (int num : arr) {     // for every element in array, print the element
            System.out.print(num + " ");   // here num represent individal element of the array
        }
//        System.out.println(arr[5]); //index out of bound error
//        arrays of objects
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));


//        function value also changes original one here
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
