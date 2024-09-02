package basic._7_element_to_n;

import java.util.Arrays;

public class ElementToNMain {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 7, 5 };
        ElementToN elementToN = new ElementToN();
        System.out.println(Arrays.toString(elementToN.solution(arr, 3)));
    }
}
