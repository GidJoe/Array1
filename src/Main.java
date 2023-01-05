import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);

        System.out.println("Wie groß soll das Array sein?");
        int a = myscan.nextInt();
        int [] array1 = new int [a];


        for (int i = 0; i < a; i++) {
            System.out.println("Bitte die "+ (i+1) + ". Zahl eingeben");
            array1[i] = myscan.nextInt();
        }

        int[] array2 = new int[array1.length];

        System.out.println("Array 1 vorher" + Arrays.toString(array1));
        System.out.println("Array 2 vorher " + Arrays.toString(array2));

        for (int z = 0, b = 1; z < array1.length; z++, b++) {
            array2[array2.length-b] = array1[z];
            }

        System.out.println("Array 1 nachher" + Arrays.toString(array1));
        System.out.println("Array 2 nachher " + Arrays.toString(array2));


    }
}