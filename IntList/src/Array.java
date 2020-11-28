import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
//        test = Array.insert(test, 6, 2);
//        reverse(test);
//        test = replicate(test);
//        for(int i : test) {
//            System.out.print(i + " ");
//        }
        int[][] test1 = {{1, 2, 3}, {}, {7, 8, 3}};
        int[] a = Array.flatten(test1);
        for(int t : a) {
            System.out.print(t + " ");
        }
        int [] testMystery = {3, 2, 1, 2};
        System.out.println(mystery(testMystery));;
    }

    public static boolean mystery(int[] array) {
        Arrays.sort(array);
        // 1, 2, 2, 3
        boolean res = false;
        for(int i = 1; i < array.length - 1; i++) {
            if(array[i] == array[i - 1]) {
                res = true;
                break;
            }
        }
        return res;
    }


    // 5, 9, 14, 15 position = 2
    public static int[] insert(int[] arr, int item, int position) {
        int[] result = new int[arr.length + 1]; // 5
        int i = 0;
        while(i < position) {
            result[i] = arr[i];
            i++;
        } // 5, 9
        result[i] = item; // 5, 9, 6
        i++;
        while(i < result.length) {
            result[i] = arr[i - 1];
            i++;
        } // 5, 9, 6, 14, 15
        return result;
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    // 3,2,1
    //
    public static int[] replicate(int[] arr) {
        int length = 0;
        for(int e : arr) {
            length += e;
        }
        int[] result = new int[length];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                result[k] = arr[i];
                k++;
            }
        }
        return result;
    }

    public static int[] flatten(int[][] x) {
        int totalLength = 0;
        for(int[] arr : x) {
            totalLength += arr.length;
        }
        int[] a = new int[totalLength];
        int aIndex = 0;
        for(int[] arr : x) {
            for(int element : arr) {
                a[aIndex] = element;
                aIndex++;
            }
        }
        return a;
    }
}
