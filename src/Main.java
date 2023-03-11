public class Main {

    public static void main(String[] args) {
//        // 1 task
        String firstTask = "Bob";
        System.out.println(helloName(firstTask));
//        // 2 task
        String secondTask1 = "Hello";
        String secondTask2 = "Java";
        System.out.println(makeAbba(secondTask1, secondTask2));
//        // 3 task
        String thirdA = "Java";
        String thirdB = "Hello";
        System.out.println(nonStart(thirdB, thirdA));
//        // 4 task
        String firthTask = "badly";
        System.out.println(endsLy(firthTask));
//        // task 5
        String fifthA = "Hello";
        System.out.println(firstTwo(fifthA));
//        // task 6
        String sixthA = "J";
        System.out.println(atFirst(sixthA));
        // task 7
        System.out.println(deFront("Hello"));
        System.out.println(deFront("Java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("xb"));
        // task 8
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        // task 9
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
        // task 10
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));


    }

    public static String helloName(String name) {
        return "Hello " + name + "!";

    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String nonStart(String a, String b) {
        String first = a.substring(1);
        String second = b.substring(1);
        String third = first.concat(second);
        return third;
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public static String firstTwo(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.length() == 1) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public static String atFirst(String str) {
        if (str.isEmpty()) {
            return "@@";
        }
        if (str.length() == 1) {
            return str + "@";
        } else {
            return str.substring(0, 2);
        }
    }

    public static String deFront(String str) {
        String result = "";

        if (str.length() > 0 && str.charAt(0) == 'a') {
            result = "a";
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result += "b";
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }

    public static String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String lastChars(String a, String b) {
        String result = "";
        if (a.length() > 0 && b.length() > 0) {
            char resultA = a.charAt(0);
            char resultB = b.charAt(b.length() - 1);
            result = String.valueOf(resultA) + String.valueOf(resultB);

            return result;
        }
        if (a.length() == 0 && b.length() > 0) {
            char resultB = b.charAt(b.length() - 1);
            result = "@" + String.valueOf(resultB);
        }
        if (a.length() > 0 && b.length() == 0) {
            char resultA = a.charAt(0);
            result = String.valueOf(resultA) + "@";

        } else {
            result = "@" + "@";
        }
        return result;
    }

    public static String conCat(String a, String b) {
        String result = "";
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            result = a.concat(b.substring(1));

        } else {
            result = a.concat(b);
        }
        return result;
    }

}

