class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        while(sb.length() > 0){
            int last = (int)(sb.charAt(sb.length()-1)-'0');
            if(last % 2 == 0){
                sb.deleteCharAt(sb.length()-1);
            }
            else break;
        }
        return sb.toString();
    }
}