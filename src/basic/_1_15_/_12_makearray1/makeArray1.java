package basic._1_15_._12_makearray1;

public class makeArray1 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = 0; i < n / k; i++) {
            answer[i] = k * (i + 1);
        }
        return answer;
    }
}
