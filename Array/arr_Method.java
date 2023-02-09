package Array;

import java.util.Scanner;


    public class arr_Method {
        public static void main(String[] args) {
            // method 1
            /*
             * int[] arr;
             * arr = new int[5];
             * arr[0] = 9;
             * arr[1] = 4;
             * arr[2] = 6;
             * arr[3] = 8;
             * arr[4] = 3;
             * System.out.println(arr[2]);
             */

            // methode 2
            /*
             * Scanner sc = new Scanner(System.in);
             * System.out.println("enter the allocation");
             * int n = sc.nextInt();
             * int[] arr = new int[3];
             * arr[0] = 79;
             * arr[1] = 66;
             * arr[2] = 655;
             * System.out.println(arr[n]);
             */

            // method 3

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the allocation");
            int n = sc.nextInt();
            int[] arr = { 56, 86, 95, 64, 31, 32 };
            System.out.println(arr[n]);

        }

    }

