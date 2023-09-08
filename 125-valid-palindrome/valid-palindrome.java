class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]+", "");
        s = s.toLowerCase();
        char ch[]=s.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--)
        {  
        rev+=ch[i];  
        }
        return (s.equals(rev));
    }
}