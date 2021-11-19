package testQuickSort;
import sortingStudentsByGpa.*;

public class TestQuickSort {
    public static void main(String[] args) {
        SortingStudentsByGpa s = new SortingStudentsByGpa();
        s.quickSort();
        s.printArray();
    }
}
