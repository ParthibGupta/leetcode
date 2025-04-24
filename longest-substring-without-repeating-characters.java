class Solution {
    public int lengthOfLongestSubstring(String s) {

        boolean[] vis = new boolean[200];
        int len = s.length();
        if(len == 0) return 0;
        int left = 0, right = 1;
        int maxLen = 1;
        while(left < len && right < len){
            int al = s.charAt(left);
            vis[al] = true;
            int ar = s.charAt(right);

            //reached a letter which was already in substr
            if(vis[ar]){
                System.out.println("Left = " + left + " Right = " + right);
                System.out.println("Found visited in " + right + " for character " + s.charAt(right) + " for asii value " + ar);
                
                //Continue until that character is found
                while(s.charAt(left) != s.charAt(right) && left < right){
                    
                    int ll = s.charAt(left);
                    vis[ll] = false;
                    left++;
                }

                //move left index after the match char
                left += 1;
                right += 1;
                continue;
            }

            //include in substr
            maxLen = Math.max(right-left+1, maxLen);
            vis[ar] = true;
            right++;
            
        }

        return maxLen;
        
    }
}