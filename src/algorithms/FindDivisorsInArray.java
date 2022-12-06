package algorithms;
import java.util.ArrayList;

//프로그래머스 코딩테스트 입문 <n의 배수 고르기>
public class FindDivisorsInArray {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int x : numlist) {
            if(x % n == 0) {
                answer.add(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindDivisorsInArray numList = new FindDivisorsInArray();
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        for(int x : numList.solution(3, numlist)){
            System.out.print(x + " ");
        }
    }
}