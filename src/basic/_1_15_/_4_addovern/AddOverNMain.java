package basic._1_15_._4_addovern;

public class AddOverNMain {
    public static void main(String[] args) {
        AddOverN addOverN = new AddOverN();
        int[] nums1 = { 34, 5, 71, 29, 100, 34 };
        int[] nums2 = { 58, 44, 27, 10, 100 };
        System.out.println("result1 = " + addOverN.solution(nums1, 123));
        System.out.println("result2 = " + addOverN.solution(nums2, 139));
    }
}
