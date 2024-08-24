package basic._1_touppercase;

public class ToUpperCase {
    public String solution(String myString) {
        /* #1
        return myString.toUpperCase();
         */

       /* #2
        String newStr = "";
        for (char c : myString.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                newStr += (char) (c - 'a' + 'A');
            } else {
                newStr += c;
            }
        }
        return newStr;
        */

        String newStr = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) >= 'a' && myString.charAt(i) <= 'z') {
                newStr += (char) (myString.charAt(i) - 'a' + 'A');
            } else {
                newStr += myString.charAt(i);
            }
        }
        return newStr;
    }
}
