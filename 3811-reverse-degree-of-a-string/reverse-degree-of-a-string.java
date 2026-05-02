class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            int val = (int)('z'- s.charAt(i))+1;
            sum = sum+(i+1)*val;
        }
        return sum;

    }
}