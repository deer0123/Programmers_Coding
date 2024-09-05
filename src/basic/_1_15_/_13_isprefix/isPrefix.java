package basic._1_15_._13_isprefix;

public class isPrefix {
   /* #1
    public int solution(String my_string, String is_prefix) {
        if (is_prefix.length() > my_string.length()) return 0;
        for (int i = 0; i < is_prefix.length(); i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) {
                return 0;
            }
        }
        return 1;
    }
    */

   /* #2
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
    */

    public int solution(String my_string, String is_prefix) {
        if (my_string.indexOf(is_prefix) == 0) return 1;
        return 0;
    }
}
