package basic._1_15_._9_from_n_element;

import java.util.Arrays;

public class fromNElement {
    /* #1
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n - 1)];
        for(int i = 0; i < num_list.length - (n - 1); i++) {
            answer[i] = num_list[n - 1 + i];
        }
        return answer;
    }
     */

    /* #2
    public int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
    }
     */

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n - 1)];
        for (int i = n - 1; i < num_list.length; i++) {
            answer[i - (n - 1)] = num_list[i];
        }
        return answer;
    }
}
