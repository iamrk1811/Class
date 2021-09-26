import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 2;
        int res = ++a - b + b + c + c++ + a++;
        System.out.println(res);

    }

    public static int binarySearchOptimized(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        int possibleAns = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(key <= arr[mid]) {
                possibleAns = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return possibleAns;
    }

    public static int binarySearchRight(int[] arr, int key) {

//        right
        int start = 0, end = arr.length - 1;

        int possibleAns = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                possibleAns = mid;
                start = mid + 1;
            } else if (arr[mid] < key) {
//                right side
                start = mid + 1;
            } else {
//                left side
                end = mid - 1;
            }
        }

        return possibleAns;
    }
    public static int binarySearchLeft(int[] arr, int key) {

//        left
        int start = 0, end = arr.length - 1;

        int possibleAns = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                possibleAns = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
//                right side
                start = mid + 1;
            } else {
//                left side
                end = mid - 1;
            }
        }

        return possibleAns;
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
//                right side
                start = mid + 1;
            } else {
//                left side
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int convertAnyBaseToDecimal(int sourceBase, int number) {
        int res = 0;
        int mod = 1;

        while (number > 0) {
            int digit = number % 10;
            int temp = digit * mod;
            res += temp;

            number /= 10; // number = number / 10;
            mod *= sourceBase;
        }

        return res;
    }
    public static int convertOctalToDecimal(int number) {
        int res = 0;
        int mod = 1;

        while (number > 0) {
            int digit = number % 10;
            int temp = digit * mod;
            res += temp;

            number /= 10; // number = number / 10;
            mod *= 8;
        }

        return res;
    }

    public static int decimalToAnyBase(int number, int base) {
        int res = 0;

        int div = base;
        int mod = 1;

        while (number > 1) {
            int rem = number % div;
            number = number / div;

            int temp = mod * rem;
            res = res + temp;

            mod = mod * 10;
        }

        if(number == 1) {
            int temp = mod * number;
            res = res + temp;
        }

        return res;
    }

    public static void decimalToBinary(int number) {
        String res = "";
        int div = 2;
        while (number > 1) {
            int rem = number % div;
            number /= div; // number = number / div;
            char ch = (char) (48 + rem); // '0' , '1'
//            if(ch > 57) {
//                ch = (char) (65 + (ch - '9' - 1));
//            }

            res = ch + res;
        }

        if(number == 1) {
            char ch = (char) (48 + number);
//            res = '1' + res;
            res = ch + res;
        }

        System.out.println(res);
    }

    public static int decimalToBinaryFinal(int number) {
        int res = 0;

        int div = 2;
        int mod = 1;

        while (number > 1) {
            int rem = number % div;
            number = number / div;

            int temp = mod * rem;
            res = res + temp;

            mod = mod * 10;
        }

        if(number == 1) {
            int temp = mod * number;
            res = res + temp;
        }

        return res;
    }
}


