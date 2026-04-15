1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        int freqArr[] = new int[101];
4        int maxFreq = 0, sum = 0;
5        for (int element : nums) {
6            freqArr[element]++;
7            int currFreq = freqArr[element];
8            if (currFreq > maxFreq) {
9                maxFreq = currFreq;
10                sum = currFreq;
11            } else if (currFreq == maxFreq) {
12                sum += currFreq;
13            }
14        }
15        return sum;
16    }
17}