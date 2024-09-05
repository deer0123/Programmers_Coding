package basic._001_015_._005_common_multiple;

public class ComMultiple {
  /* #1
    public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        }
        return 0;
    }
  */

   /* #2
    public int solution(int number ,int n, int m) {
        if (isCommon(number, n) && isCommon(number , m)) {
            return 1;
        }
        return 0;
    }

    public boolean isCommon(int number, int n) {
        if (number % n == 0) {
            return true;
        }
        return false;
    }
    */

    public int solution(int number, int n, int m) {
        return (number % n == 0) && (number % m == 0) ? 1 : 0;
    }
}
