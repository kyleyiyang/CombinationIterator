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

%%%%%%%%%%%%%%%%
    
    class CombinationIterator {
    char[] chars;
    List<String> lst;
    public CombinationIterator(String characters, int combinationLength) {
        chars=characters.toCharArray();
        lst=new ArrayList<String>();
        backtrack(chars,combinationLength,0,new ArrayList<Character>());
    }
    public void backtrack(char[] chars,int length,int start,ArrayList<Character> s) {
        if (s.size()==length) {
            String temp="";
            for (char c:s) temp+=c;
            lst.add(temp);
            return;
        }
        for (int i=start;i<chars.length;i++) {
            s.add(chars[i]);
            backtrack(chars,length,i+1,s);
            s.remove(s.size()-1);
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
*****************************

class CombinationIterator {
    List<String> lst;
    public CombinationIterator(String characters, int combinationLength) {
        lst=new ArrayList<String>();
        backtrack(characters,combinationLength,0,new StringBuilder());
    }
    public void backtrack(String characters,int length,int start,StringBuilder s) {
        if (s.length()==length) {lst.add(s.toString());return;}
        for (int i=start;i<characters.length();i++) {
            s.append(characters.charAt(i));
            backtrack(characters,length,i+1,s);
            s.deleteCharAt(s.length()-1);
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

