package basic._001_015_._010_first_negative;

public class firstNegativeMain {
    public static void main(String[] args) {
        int[] arr1 = { 12, 4, 15, 46, 38, -2, 15 };
        int[] arr2 = { 13, 22, 53, 24, 15, 6 };
        firstNegative firstNegative = new firstNegative();
        System.out.println(firstNegative.solution(arr1));
        System.out.println(firstNegative.solution(arr2));
    }
}
