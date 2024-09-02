package basic._2_operonlength;

public class OperOnLength {
   /* #1
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length > 10) {
            for (int i : num_list)
                answer += i;
        } else {
            answer += 1;
            for (int i : num_list)
                answer *= i;
        }
        return answer;
    }
    */

   /* #2
    public int solution(int[] num_list) {
        int answer = num_list.length > 10 ? 0 : 1;
        if (num_list.length > 10) {
            for (int i : num_list)
                answer += i;
        } else {
            for (int i : num_list)
                answer *= i;
        }
        return answer;
    }
    */

    public int solution(int[] num_list) {
        int answer = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            answer = num_list.length > 10 ? answer + num_list[i] : answer * num_list[i];
        }
        return answer;
    }

   /* # 3
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length > 10) {
            answer = addNums(num_list);
        } else {
            answer = multiNums(num_list);
        }
        return answer;
    }

    private int addNums(int[] num_list) {
        int add_Result = 0;
        for (int i : num_list) {
            add_Result += i;
        }
        return add_Result;
    }

    private int multiNums(int[] num_list) {
        int multi_Result = 1;
        for (int i  : num_list) {
            multi_Result *= i;
        }
        return multi_Result;
    }
    */
}
