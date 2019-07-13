package String3;

public class CountYZ {
    public static int countYZ(String str) {

       int result = 0;

       for(String words : str.split(" ")){
           if (Character.isLetter(words.charAt(words.length()-1)) && (words.toLowerCase().charAt(words.length()-1) == 'y' || words.toLowerCase().charAt(words.length()-1) == 'z')) {
               result++;
           }
            }
        return result;
        }
    }
