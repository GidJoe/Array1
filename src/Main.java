import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*
        LF 6 / ProgrammierungII
        Array, Aufgabensammlung
        A04.01 Array Aufgabensammlung (1).pdf
        Aufgabe 1a, 1b und 2
        von M.W
        */

        Scanner myscan = new Scanner(System.in);

        System.out.println("Wie groß soll das Array sein?");
        int a = myscan.nextInt();
        int[] array1 = new int[a];
        int[] array2 = new int[array1.length];

        // Aufgabe 1 b - Array wird von Benutzer Übergeben
        for (int i = 0; i < a; i++) {
            System.out.println("Bitte die " + (i + 1) + ". Zahl eingeben");
            array1[i] = myscan.nextInt();
        }
        myscan.close();

        // Aufgabe 1 a - Array wird umgedreht
        for (int z = 0, b = 1; z < array1.length; z++, b++) {
            array2[array2.length - b] = array1[z];
        }
        System.out.println("_________________________________________");
        System.out.println("Gewünschtes Array " + Arrays.toString(array1));
        System.out.println("Gewünschtes Array - umgekehrt " + Arrays.toString(array2));


        // Aufgabe 2 sortiert even/odd

        int position = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[position] = array1[i];
                position++;
            }
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array2[position] = array1[i];
                position++;
            }
        }
        System.out.println("Gewünschtes Array - sortiert even/odd " + Arrays.toString(array2));
    }


}




