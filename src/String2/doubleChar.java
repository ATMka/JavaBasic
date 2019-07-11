package String2;

public class doubleChar {
    public static String doubleChar(String str) {
        String result="";
        for(int i = 0;i <= str.length()-1;i++){
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

}
