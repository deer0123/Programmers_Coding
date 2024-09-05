package basic._001_015_._003_convertarr;

import java.util.Arrays;

public class convertArrMain {
    public static void main(String[] args) {
        ConvertArr convertArr = new ConvertArr();
        int[] arr = { 1, 2, 3, 100, 99, 98 };
        System.out.println("Before: " + Arrays.toString(arr));
        System.out.println("After: " + Arrays.toString(convertArr.solution(arr)));
    }
}
