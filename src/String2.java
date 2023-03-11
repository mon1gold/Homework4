public class String2 {
    public static void main(String[] args) {
//        //task 1
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
//        // task 2
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
//        // task 3
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
//        // task 4
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
        // task 5
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("abc.xyzxyz"));

    }

    public static String doubleChar(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += String.valueOf(chars[i]).repeat(2);
        }
        return result;
    }

    public static int countHi(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.substring(i, i + 2).equals("hi")) {
                result++;
            }
        }
        return result;
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public static boolean endOther(String a, String b) {
        if (a.length() > b.length()) {
            return a.toLowerCase().endsWith(b.toLowerCase());
        } else {
            return b.toLowerCase().endsWith(a.toLowerCase());
        }
    }

    public static boolean xyzThere(String str) {
        int index = str.indexOf("xyz");
        while (index != -1) {
            if (index == 0) {
                return true;
            } else {
                char indexDot = str.charAt(index - 1);
                if (indexDot != '.') {
                    return true;
                }
            }
            index = str.indexOf("xyz", index + 1);

        }
        return false;
    }

}
