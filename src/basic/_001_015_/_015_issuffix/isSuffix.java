package basic._001_015_._015_issuffix;

public class isSuffix {
   /* #1
    public int solution(String my_string, String is_suffix) {
        if (is_suffix.length() > my_string.length()) return 0;
        for (int i = 0; i < is_suffix.length(); i++) {
            int string_idx = my_string.length() - 1 - i;
            int suffix_idx = is_suffix.length() - 1 - i;
            if (my_string.charAt(string_idx) != is_suffix.charAt(suffix_idx)) return 0;
        }
        return 1;
    }
    */

    public int solution(String my_string, String is_suffix) {
        return (my_string.endsWith(is_suffix)) ? 1 : 0;
    }
}
