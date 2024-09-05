package basic._1_15_._2_operonlength;

public class OperOnLengthMain {
    public static void main(String[] args) {
        OperOnLength operOnLength = new OperOnLength();
        int[] nums1 = { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 };
        int[] nums2 = { 2, 3, 4, 5 };

        System.out.println("result = " + operOnLength.solution(nums1));
        System.out.println("result2 = " + operOnLength.solution(nums2));
    }
}
