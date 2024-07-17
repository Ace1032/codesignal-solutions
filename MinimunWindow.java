import java.util.*;

public class Main {
    public static void main(String[] args) {
     String s = "ADOBECODEBANC";
     String t = "ABC";
     System.out.println(minSub(s, t));
     
  }
  

  static String minSub(String s, String t){
    if(t.length()>s.length()) return "";
    HashSet<Character> charset = new HashSet<>();
    HashSet<String> subStrings= new HashSet<>();
    String shotestS=s;
    int left =0;
    for(int i =0; i< s.length(); i++){
      if(charset.size() == 0) left = i;
      
      if(t.indexOf(s.charAt(i)) !=-1  && !charset.contains(s.charAt(i) ) ){
        charset.add(s.charAt(i));
      }
      if(charset.size() == t.length()){
        subStrings.add(s.substring(left, i+1));
        if(s.substring(left, i+1).length() < shotestS.length()){
          shotestS= s.substring(left, i+1);
        }
        charset.clear();
        i = left+1;
      }
    }
    
    
    
    return shotestS;
  }
  
