package sortingStudentsByGpa;
import comparator.Comparator;

public class SortingStudentsByGpa implements Comparator {
    public static int ARRAY_LENGTH = 7;
    public int idNumber[];
    public int n;
    public SortingStudentsByGpa() {
        idNumber = new int[ARRAY_LENGTH];
        idNumber[0] = 102;
        idNumber[1] = 10;
        idNumber[2] = 15;
        idNumber[3] = 3;
        idNumber[4] = 30;
        idNumber[5] = 100;
        idNumber[6] = 59;

    }

    public void printArray() {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(idNumber[ARRAY_LENGTH-1-i] + ", ");
            n++;
        }
        System.out.println(idNumber[ARRAY_LENGTH-1-n]);
    }

    public void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    public void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (idNumber[i] <= idNumber[cur])) {
                i++;
            }
            while (j > cur && (idNumber[cur] <= idNumber[j])) {
                j--;
            }
            if (i < j) {
                int temp = idNumber[i];
                idNumber[i] = idNumber[j];
                idNumber[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }
}