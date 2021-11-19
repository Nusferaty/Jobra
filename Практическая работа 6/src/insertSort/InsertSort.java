package insertSort;

public class InsertSort {

    public int idNumber[];

    public InsertSort() {
        idNumber = new int[6];
        idNumber[0] = 102;
        idNumber[1] = 10;
        idNumber[2] = 15;
        idNumber[3] = 3;
        idNumber[4] = 30;
        idNumber[5] = 100;
    }

    public void iSort() {
        for (int i = 1; i < idNumber.length; i++) {
            int currElem = idNumber[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && idNumber[prevKey] > currElem) {
                idNumber[prevKey + 1] = idNumber[prevKey];
                idNumber[prevKey] = currElem;
                prevKey--;
            }
        }
    }

    public void PrintScr() {
        for (int aIdNumber : idNumber) {
            System.out.println(aIdNumber);
        }
    }
}
