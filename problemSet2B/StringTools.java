/** 
 * Naomi Wolfman
 * sept. 25 2024
 * 1-3
 * Problem set 2B
 */

public class StringTools {
    public String lastLetter(String str) {
        String lastLetter = str.substring(str.length()-1);
        return lastLetter;
    }
    
    public String formatPhoneNumber(String str) {
        String goodNumber = "(" + str.substring(0, 3) +") "+ str.substring(3, 6) + "-" + str.substring(6);
        return goodNumber;
    }
    
    public String middleThree(String str) {
        int skipNum = (str.length()-3)/2;
        System.out.print(skipNum);
        String midThree = str.substring(skipNum, skipNum + 3);
        return midThree;
    }
}