import java.util.Arrays;

class TestMergeSort {
/*
        idNumber[0] = 102;
        idNumber[1] = 10;
        idNumber[2] = 15;
        idNumber[3] = 3;
        idNumber[4] = 30;
        idNumber[5] = 100;
        idNumber[6] = 26;
        idNumber[7] = 5;
        idNumber[8] = 79;
        idNumber[9] = 0;
        idNumber[10] = 200;
*/

    public static int[] mergesort(int[] idNumber) {
        int[] buffer1 = Arrays.copyOf(idNumber, idNumber.length);
        int[] buffer2 = new int[idNumber.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, idNumber.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] idNumber = { 102, 10, 15, 3, 30, 100, 26, 5, 79, 0, 200 };
        int[] result = mergesort(idNumber);
        System.out.println(Arrays.toString(result));
    }

}
