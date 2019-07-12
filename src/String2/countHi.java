package String2;

public class countHi {
    public static int countHi(String str) {
        int i = 0;
        int result = 0;
        while(i <= str.length() &&str.indexOf("hi",i) != -1)
        {
            i = str.indexOf("hi",i)+2;
            result++;
        }
        return result;
    }
}
