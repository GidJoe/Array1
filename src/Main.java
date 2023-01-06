import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);

//        System.out.println("Wie groß soll das Array sein?");
//        int a = myscan.nextInt();
//        int[] array1 = new int[a];
//
//
//        for (int i = 0; i < a; i++) {
//            System.out.println("Bitte die " + (i + 1) + ". Zahl eingeben");
//            array1[i] = myscan.nextInt();
//        }
        int[] array1 = {7, 2, 3, 5, 6, 8, 10};
        int[] array2 = new int[array1.length];

//        System.out.println("Array 1 vorher" + Arrays.toString(array1));
//        System.out.println("Array 2 vorher " + Arrays.toString(array2));

        for (int z = 0, b = 1; z < array1.length; z++, b++) {
            array2[array2.length - b] = array1[z];
        }
        int[] array3 = new int[7];

//        System.out.println("Array 1 nachher" + Arrays.toString(array1));
//        System.out.println("Array 2 nachher " + Arrays.toString(array2));
        //  {7, 2, 3, 5, 6, 8, 10};
        boolean vollständig = true;
        int i = 0, b = 1;
        while (vollständig) {
            if (array1[i] % 2 == 0) {
                array3[i] = array1[i];
                System.out.println(Arrays.toString(array3));
                i++;
                if (array2.length==array3.length) {
                    vollständig = false;
                }
            if (array1[i] % 2 != 0){
                array3[i] = array1[array1.length-b];
                System.out.println(Arrays.toString(array3));
                b++;
                if (array2.length==array3.length) {
                    vollständig = false;
                }
            }
        }
        System.out.println("Array 1 nachher"+Arrays.toString(array1));
        System.out.println("Array 2 nachher "+Arrays.toString(array3));
    }
}



