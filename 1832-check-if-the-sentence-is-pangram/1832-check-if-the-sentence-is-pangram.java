class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        boolean []alphabet=new boolean[26];
        int count = 0;
        for(int i=0; i< sentence.length() ; i++){
            char ch=sentence.charAt(i);
            int index= ch - 'a';
            if(ch >= 'a' && ch <= 'z'){
            if(!alphabet[index]){
                alphabet[index]=true;
                count++;
                if(count == 26){
                    return true;
                }
            }
          }
        }
      return false;
    }
}