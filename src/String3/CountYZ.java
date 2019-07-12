package String3;

public class CountYZ {
    public static int countYZ(String str) {
        int result = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (!Character.isLetter(str.charAt(i + 1)) && (str.toLowerCase().charAt(i) == 'y' || str.toLowerCase().charAt(i) == 'z')) {
                result++;
            }
        }
        if (str.toLowerCase().charAt(str.length() - 1) == 'y' || str.toLowerCase().charAt(str.length() - 1) == 'z') {
            result++;
        }
        return result;
    }
}
