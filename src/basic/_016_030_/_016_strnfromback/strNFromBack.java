package basic._016_030_._016_strnfromback;

public class strNFromBack {
   /* #1
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = my_string.length() - 1; i > my_string.length() - n - 1; i--) {
            answer = my_string.charAt(i) + answer;
        }
        return answer;
    }
    */

    /* #2
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
    */

    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer = my_string.charAt(my_string.length() - 1 - i) + answer;
        }
        return answer;
    }
}
