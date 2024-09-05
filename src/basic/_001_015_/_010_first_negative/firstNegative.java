package basic._001_015_._010_first_negative;

public class firstNegative {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) return i;
        }
        return -1;
    }
}
