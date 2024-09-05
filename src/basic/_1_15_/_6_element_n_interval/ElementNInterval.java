package basic._1_15_._6_element_n_interval;

public class ElementNInterval {
    /* #1
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        if (num_list.length % n == 0) {
            answer = new int[num_list.length / n];
        } else {
            answer = new int[num_list.length / n + 1];
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
    */

    /* #2
    public int[] solution(int[] num_list, int n) {
        int listLength = num_list.length;
        int newLength = listLength % n == 0 ? listLength / n : listLength / n + 1;
        int[] answer = new int[newLength];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
     */

    public int[] solution(int[] num_list, int n) {
        int newLength = (int) Math.ceil((double) num_list.length / n);
        int[] answer = new int[newLength];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}
