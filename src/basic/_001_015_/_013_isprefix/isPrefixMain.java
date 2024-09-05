package basic._001_015_._013_isprefix;

public class isPrefixMain {
    public static void main(String[] args) {
        String my_string = "banana";
        isPrefix isPrefix = new isPrefix();
        System.out.println(isPrefix.solution(my_string, "ban"));
        System.out.println(isPrefix.solution(my_string, "nan"));
        System.out.println(isPrefix.solution(my_string, "abcd"));
        System.out.println(isPrefix.solution(my_string, "bananan"));
    }
}
