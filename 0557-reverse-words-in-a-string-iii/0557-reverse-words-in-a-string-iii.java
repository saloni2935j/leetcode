class Solution {
    public String reverseWords(String s) {
      String[] words = s.split(" ");
      StringBuilder st = new StringBuilder ();

      for(String word : words){
        StringBuilder temp = new StringBuilder(word);
        st.append(temp.reverse()).append(" ");
      }
      return st.toString().trim();
    }
}