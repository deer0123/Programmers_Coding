package basic._1_15_._8_change_order;

import java.util.Arrays;

public class changeOrder {
    /* #1
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = n; i < num_list.length; i++) {
            answer[i - n] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[num_list.length - n + i] = num_list[i];
        }
        return answer;
    }
     */

    /* #2
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[i] = (n + i < len) ? num_list[n + i] : num_list[n + i - len];
        }
        return answer;
    }
     */

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            if (n == num_list.length) {
                n = 0;
            }
            answer[i] = num_list[n];
            n++;
        }
        return answer;
    }
}
