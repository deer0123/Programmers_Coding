package basic._1_15_._10_first_negative;

import java.util.Arrays;

public class firstNegative {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) return i;
        }
        return -1;
    }
}
