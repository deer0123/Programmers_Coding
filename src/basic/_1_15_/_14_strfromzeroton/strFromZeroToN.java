package basic._1_15_._14_strfromzeroton;

public class strFromZeroToN {
   /* #1
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
    */
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
