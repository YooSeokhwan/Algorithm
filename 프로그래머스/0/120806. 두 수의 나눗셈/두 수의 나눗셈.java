import java.util.*;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double div = (double)num1/num2;
        //System.out.println(div);
        
        double mul = div * 1000;
        answer = (int) mul;
        System.out.println(answer);
        return answer;
    }
}