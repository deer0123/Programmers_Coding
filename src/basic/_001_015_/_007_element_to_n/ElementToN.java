package basic._001_015_._007_element_to_n;

import java.util.Arrays;

public class ElementToN {
    /* #1
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
    */

    /* #2
    public int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOf(num_list, n);
        return answer;
    }
     */

    public int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOfRange(num_list, 0, n);
        return answer;
    }
}

