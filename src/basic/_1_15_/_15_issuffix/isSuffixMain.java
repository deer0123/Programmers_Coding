package basic._1_15_._15_issuffix;

public class isSuffixMain {
    public static void main(String[] args) {
        String my_string = "banana";
        isSuffix isSuffix = new isSuffix();
        System.out.println(isSuffix.solution(my_string, "ana"));
        System.out.println(isSuffix.solution(my_string, "nan"));
        System.out.println(isSuffix.solution(my_string, "wxyz"));
        System.out.println(isSuffix.solution(my_string, "abanana"));
    }
}
