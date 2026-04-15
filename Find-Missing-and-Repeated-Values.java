1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        int n = grid.length;
4        int m = n * n;
5        long expectedSum = (long) (m * (m + 1)) / 2;
6        long squareSum = (long) (m * (m + 1) * (2L * m + 1)) / 6;
7        long sum = 0, sum2 = 0;
8        for (int i = 0; i < n; i++) {
9            for (int j = 0; j < n; j++) {
10                sum += grid[i][j];
11                sum2 += (long) grid[i][j] * grid[i][j];
12            }
13        }
14        long val1 = sum - expectedSum;
15        long val2 = sum2 - squareSum;
16        long a = (val1 + val2 / val1) / 2;
17        long b = a - val1;
18        return new int[] { (int) a, (int) b };
19    }
20}