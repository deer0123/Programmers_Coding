package basic._1_15_._6_element_n_interval;

import java.util.Arrays;

public class ElementNIntervalMaion {
    public static void main(String[] args) {
        ElementNInterval elementNInterval = new ElementNInterval();
        int[] arr = { 4, 2, 6, 1, 7, 6 };
        System.out.println(Arrays.toString(elementNInterval.solution(arr, 2)));
        System.out.println(Arrays.toString(elementNInterval.solution(arr, 4)));
    }
}
