package String3;

public class countYZ {
    public static int countYZ(String str) {
        int result=0;
        for (int i = 0; i <= str.length(); i++) {
            if(i<str.length()-1) {
                if (Character.isLetter(str.charAt(i + 1)) != true && (str.toLowerCase().charAt(i) == 'y' || str.toLowerCase().charAt(i) == 'z')) {
                    result++;
                }
            }
            else if (i == str.length()-1) {
                if (str.toLowerCase().charAt(i) == 'y' || str.toLowerCase().charAt(i) == 'z') {
                    result++;
                }
            }
        }
        return result;
    }
}
