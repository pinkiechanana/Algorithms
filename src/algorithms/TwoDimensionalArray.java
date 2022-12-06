package algorithms;

import java.util.Arrays;

public class TwoDimensionalArray {
    public int[][] solution (int[] num_list, int n) {
        int length = num_list.length/n;
        int index = 0;
        int[][] answer = new int[length][n];
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int[][] arr = twoDimensionalArray.solution(num_list, n);

        System.out.println(Arrays.deepToString(arr));
    }
}