class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String str = "";
        for(String i : arr)
        {
            str += new StringBuilder(i).reverse().toString()+" "; 

        }
        return str.trim();  
    }
}