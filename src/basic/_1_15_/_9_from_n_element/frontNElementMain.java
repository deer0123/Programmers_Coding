package basic._1_15_._9_from_n_element;

import java.util.Arrays;

public class frontNElementMain {
    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 6 };
        int[] arr2 = { 5, 2, 1, 7, 5 };
        fromNElement fromNElement = new fromNElement();
        System.out.println(Arrays.toString(fromNElement.solution(arr1, 3)));
        System.out.println(Arrays.toString(fromNElement.solution(arr2, 2)));
    }
}
