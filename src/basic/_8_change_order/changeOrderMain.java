package basic._8_change_order;

import java.util.Arrays;

public class changeOrderMain {
    public static void main(String[] args) {
        int[] arr1 = { 5, 2, 1, 7, 5 };
        int[] arr2 = { 2, 1, 6 };
        changeOrder changeOrder = new changeOrder();
        System.out.println((Arrays.toString(changeOrder.solution(arr1, 3))));
        System.out.println((Arrays.toString(changeOrder.solution(arr2, 1))));
    }
}
