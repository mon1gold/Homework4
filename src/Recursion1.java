public class Recursion1 {
    public static void main(String[] args) {
        // task 1
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        // task 2
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
        // task 3
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        // task 4
        System.out.println(triangle(2));
        System.out.println(triangle(1));
        System.out.println(triangle(0));
        // task 5
        System.out.println(sumDigits(126));
        System.out.println(sumDigits(49));
        System.out.println(sumDigits(12));
        // task 6
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
        // task 7
        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(8818));
        // task 8
        System.out.println(powerN(3, 1));
        System.out.println(powerN(3, 2));
        System.out.println(powerN(3, 3));
        // task 9
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("xhixhix"));
        // task 10
        System.out.println(countHi("xxhixx") );
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int bunnyEars(int bunnies) {
        return bunnies * 2;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + triangle(rows - 1);
        }

    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    public static int count7(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    public static int count8(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 100 == 88) {
            return 2 + count8(n / 10);
        } else if (n % 10 == 8) {
            return 1 + count8(n / 10);
        } else {
            return count8(n / 10);
        }
    }

    public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return base * powerN(base, n - 1);
        }
    }

    public static int countX(String str) {

        if (str.length() == 0) {
            return 0;
        }
        int count = countX(str.substring(1));
        if (str.charAt(0) == 'x') {
            count++;
        }
        return count;
    }

    public static int countHi(String str) {

        if (str.length() < 2) {
            return 0;
        }
        int count = countHi(str.substring(1));
        if (str.substring(0, 2).equals("hi")) {
            count++;
        }
        return count;
    }
}
