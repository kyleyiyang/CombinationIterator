class CombinationIterator {
    char[] chars;
    List<String> lst;
    public CombinationIterator(String characters, int combinationLength) {
        chars=characters.toCharArray();
        lst=new ArrayList<String>();
        backtrack(chars,combinationLength,0,"");
    }
    public void backtrack(char[] chars,int length,int start,String s) {
        if (s.length()==length) {lst.add(s);return;}
        for (int i=start;i<chars.length;i++) {
            s+=chars[i];
            backtrack(chars,length,i+1,s);
            s=s.substring(0,s.length()-1);
        }
    }
    
    public String next() {
        if (hasNext()) {
            String temp= lst.get(0);
            lst.remove(0);
            return temp;
        } else return "";
    }
    
    public boolean hasNext() {
        if (lst.size()>0) return true;
        else return false;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
