package PairSumProblem;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static int[][] pairSum(int[] arr, int s){
        int n = arr.length;

        // Used to store result.
        List<int[]> ans = new ArrayList();

        // Checking sum for every element.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == s) {
                    int[] pair = new int[2];
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    ans.add(pair);
                }
            }
        }

        // Used to store final sorted result.
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            int a = ans.get(i)[0], b = ans.get(i)[1];
            res[i][0] = Math.min(a, b);
            res[i][1] = Math.max(a, b);
        }

        Arrays.sort(res, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        });

        return res;
    }
}
