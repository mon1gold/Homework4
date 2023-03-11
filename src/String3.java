public class String3 {
    public static void main(String[] args) {
        // task 1
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
        // task 2
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }

    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }
        return count;
    }

    public static boolean equalIsNot(String str) {

        int countIs = 0;
        int countNot = 0;
        int index = 0;
        while ((index = str.indexOf("is", index)) != -1) {
            countIs++;
            index += 2;
        }
        index = 0;
        while ((index = str.indexOf("not", index)) != -1) {
            countNot++;
            index += 3;
        }
        return countIs == countNot;
    }


}
