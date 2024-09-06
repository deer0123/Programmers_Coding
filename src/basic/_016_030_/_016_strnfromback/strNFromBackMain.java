package basic._016_030_._016_strnfromback;

public class strNFromBackMain {
    public static void main(String[] args) {
        String str1 = "ProgrammerS123";
        String str2 = "He11OWOrld";
        strNFromBack strNFromBack = new strNFromBack();
        System.out.println(strNFromBack.solution(str1, 11));
        System.out.println(strNFromBack.solution(str2, 5));
    }
}
