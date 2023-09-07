package junits;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static modules.iterative.SearchModule.binarySearch;
import static modules.iterative.SearchModule.contains;
import static modules.iterative.SortModule.bubbleSort;
import static modules.iterative.SortModule.insertionSort;
import static modules.iterative.SortModule.selectionSort;
import static modules.recursive.SortModule.mergeSort;
import static modules.recursive.SortModule.quickSort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlgorithmsJUnitTest {

    static int[] makeList() {
        Random random = new Random();
        int 	bound  = 1000;				//upper bound of values
        int[] 	list   = new int[bound / 2];
        int 	num;

        for(int i = 0; i < list.length; i++) {
            num = random.nextInt(bound);
            if (!(contains(list, num))) {
                list[i] = num;
            }else {
                i--;
            }
        }
        return list;
    }

    @Test
    void testBinarySearch() {

        int[] list = makeList();
        quickSort(list);			//list must be sorted

        System.out.println();
        System.out.println(" \t Binary Search \t ");
        int  lValue		= list.length / 4;
        int  hValue 	= 3 * list.length / 4;
        int  low  		= list[lValue];
        int  high  		= list[hValue];
        int  location 	= binarySearch(list, low);


        assertEquals(lValue, location);
        assertEquals(low , list[location]);
        System.out.println("======================================");
        System.out.println("low value location : " + lValue);
        System.out.println("bSearch location   : " + location);
        System.out.println("low value          : " + low);
        System.out.println("bSearch value      : " + list[location]);


        location 	= binarySearch(list, high);
        assertEquals(hValue, location);
        assertEquals(high , list[location]);
        System.out.println("======================================");
        System.out.println("high value location: " + hValue);
        System.out.println("bSearch location   : " + location);
        System.out.println("high value         : " + high);
        System.out.println("bSearch value      : " + list[location]);

        System.out.println("======================================");

    }

    @Test
    void testBubbleSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t  B  U  B  B  L  E     S  O  R  T \t");
        System.out.println("======================================");
        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        bubbleSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");
    }

    @Test
    void testInsertionSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t I  N  S  E  R  T  I  O  N      S  O  R  T \t");
        System.out.println("======================================");
        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        insertionSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");
    }

    @Test
    void testMergeSort() {

        int[] list = makeList();

        System.err.println();
        System.out.println(" \t \t   M  E  R  G  E      S  O  R  T  \t");
        System.out.println("======================================");
        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        mergeSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");
    }

    @Test
    void testQuickSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t Q  U I  C  K    S  O  R  T \t");
        System.out.println("======================================");

        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        quickSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");
    }

    @Test
    void testSelectionSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t S   E   L   E   C   T   I   O   N        S   O   R  T \t");
        System.out.println("================================================================");

        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        selectionSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");
    }
}
