class Solution {
    public int[] minOperations(String boxes) {

        int n = boxes.length();
        int[] b = new int[n];

        for(int i = 0;i < n;i++){
            b[i] =  boxes.charAt(i) - '0';
        }

        int[] lr = new int[n];
        int[] rl = new int[n];
        for(int i = 0;i < n;i++){
            if(b[i] == 0) continue;
            for(int j = i+1;j < n;j++){
                lr[j] += j-i;
            }
        }

        for(int i = n-1;i >= 0;i--){
            if(b[i] == 0) continue;
            for(int j = i-1;j >= 0;j--){
                rl[j] += i-j;
            }
        }
        
        int[] ans = new int[n];
        for(int i = 0;i < n;i++){
            ans[i] = rl[i] + lr[i];
        }

        return ans;
        
    }
}