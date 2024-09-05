package basic._1_15_._4_addovern;

public class AddOverN {
       /* #1
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
            if (sum > n) {
                break;
            }
        }
        return sum;
        */

    public int solution(int[] numbers, int n) {
        int sum = 0;
        int i = 0;
        while (sum <= n) {
            sum += numbers[i++];
        }
        return sum;
    }
}
