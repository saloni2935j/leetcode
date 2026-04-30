class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");

        int n = s.length();
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            if('a' <= c && c <= 'z') sb.append(c);
            if('0' <= c && c <= '9') sb.append(c);
        }

String str = sb.toString();
int left = 0; int right = str.length()-1;
while(left < right){
    if(str.charAt(left) != str.charAt(right)){
        return false;
    }
    left++;
    right--;
} 
return true;
    }
}