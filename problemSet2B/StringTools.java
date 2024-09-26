/** 
 * Naomi Wolfman
 * sept. 25 2024
 * 1-3
 * Problem set 2B
 */


public class StringTools {
    static public String lastLetter(String str) {
        String lastLetter = str.substring(str.length()-1);
        return lastLetter;
    }
    
    static public String formatPhoneNumber(String str) {
        String goodNumber = "(" + str.substring(0, 3) +") "+ str.substring(3, 6) + "-" + str.substring(6);
        return goodNumber;
    }
    
    static public String middleThree(String str) {
        int skipNum = (str.length()-3)/2;
        String midThree = str.substring(skipNum, skipNum + 3);
        return midThree;
    }
    
    static public String swapLastTwo (String str) {
        String main = str.substring(0, str.length()-2);
        main = main + str.substring(str.length() - 1) + str.substring(str.length()-2, str.length()-1);
        return main;
    }
    
    static public boolean frontAgain (String str, int n) {
        String str1 = str.substring(0, n);
        String str2 = str.substring(str.length()-n);
        return (str1.equals(str2));
    }


}