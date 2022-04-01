package thessarx;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import static thessarx.BinarySearchTest.binarySearch;

public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            SecureRandom generator = new SecureRandom();

            int[] data = generator.ints(15, 10, 91).sorted().toArray();
            System.out.printf("%s%n%n", Arrays.toString(data));

            System.out.print("Silahkan masukan angka atau ketik -1 untuk keluar: ");
            int searchInt = input.nextInt();

            while (searchInt != -1) {
                int location = binarySearch(data, searchInt);
                if (location == -1) {
                    System.out.printf("%d was not found%n%n", searchInt);
                } else {
                    System.out.printf("%d was found in position %d%n%n", searchInt, location);
                }
                System.out.print("Silahkan masukan angka atau ketik -1 untuk keluar: ");
                searchInt = input.nextInt();
            }
        }
    }


