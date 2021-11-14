
class PrimeNumber {
    public static boolean recursion(int n, int i) {
        // Три базовых случая
        if (n < 2) {
            return false;
        }

        else if (n == 2) {
            return true;
        }

        else if (n % i == 0) {
            return false;
        }
        // Шаг рекурсии
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(17, 2)); // вызов рекурсивной функции
    }
}