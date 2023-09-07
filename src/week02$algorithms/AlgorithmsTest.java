package week02$algorithms;

import modules.iterative.SortModule;
import modules.recursive.SearchModule;

import java.util.Arrays;
import static modules.iterative.SearchModule.binarySearch;
import static modules.iterative.SortModule.bubbleSort;
import static modules.iterative.SearchModule.contains;
import static modules.iterative.SearchModule.indexOf;
import static modules.iterative.SortModule.insertionSort;
import static modules.iterative.SortModule.selectionSort;
import static modules.recursive.SortModule.mergeSort;
import static modules.recursive.SortModule.quickSort;

public class AlgorithmsTest {

    public static void checkBinarySearch(int[] array){
        System.out.println();
        System.out.println(" ========= B I N A R Y    S E A R C H =========");
        System.out.println();
        System.out.println("location of 2: " + binarySearch(array, 2));
        System.out.println("location of 5: " + binarySearch(array, 7));
        System.out.println("location of 9: " + binarySearch(array, 9));
        System.out.println();
    }


    public static void checkBubbleSort(int[] array) {
        System.out.println(" ========= B U B B L E   S O R T =========");
        System.out.println();
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void checkInsertionSort(int[] array) {
        System.out.println(" ========= I N S E R T I O N   S O R T =========");
        System.out.println();
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void checkMergeSort(int[] array) {
        System.out.println(" ========= M E R G E    S O R T =========");
        System.out.println();
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void checkQuickSort(int[] array) {
        System.out.println(" ========= Q U I C K    S O R T =========");
        System.out.println();
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void checkRecursiveBinarySearch(int[] array){
        System.out.println();
        System.out.println(" ===== R E C U R S I V E   B I N A R Y   S E A R C H =====");
        System.out.println();

        int loc01 = SearchModule.binarySearch(array, 2);
        int loc02 = SearchModule.binarySearch(array, 7);
        int loc03 = SearchModule.binarySearch(array, 9);
        System.out.println("location of 2: " + loc01);
        System.out.println("location of 7: " + loc02);
        System.out.println("location of 9: " + loc03);
        System.out.println();
    }


    public static void checkRecursiveSelectionSort(int[] array){
        System.out.println(" ========= R E C U R S I V E   S E L E C T I O N   S O R T =========");
        System.out.println(Arrays.toString(array));
        SortModule.selectionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }


    public static void checkSelectionSort(int[] array){
        System.out.println(" ========= S E L E C T I O N    S O R T =========");
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }


    public static void checkSequentialSearch(int[] array){
        System.out.println(" ========= S E L E C T I O N    S O R T =========");
        System.out.println();
        System.out.println("----------- indexOf ------------");
        System.out.println("location of 3: " + indexOf(array, 3));
        System.out.println("location of 7: " + indexOf(array, 7));
        System.out.println("location of 8: " + indexOf(array, 8));
        System.out.println();
        System.out.println("----------- contains ------------");
        System.out.println("location of 3: " + contains(array, 3));
        System.out.println("location of 7: " + contains(array, 7));
        System.out.println("location of 8: " + contains(array, 8));
        System.out.println();
    }


    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" A L G O R I T H M S    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        intro();
        int[] array  = {2, 9, 4, 1, 7, 5, 3, 8, 6};
        int[] array1 = {2, 5, 7, 1, 4, 3, 6};
        int[] array2 = {1, 2, 4, 5, 6, 8, 9};
        int[] array3 = {2, 5, 11, 1, 9, 4, 16, 8, 13};

        checkBinarySearch(array2);

        // Using an anonymous array
        checkBinarySearch(new int[] {1, 2, 4, 5, 6, 8, 9});

        checkSelectionSort(array);

        // Using an anonymous array
        checkSelectionSort(new int[] {2, 9, 4, 1, 7, 5, 3, 8, 6});
    }

}
