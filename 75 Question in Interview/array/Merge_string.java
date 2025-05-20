/*1768. Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:

            Input: word1 = "abc", word2 = "pqr"
            Output: "apbqcr"
            Explanation: The merged string will be merged as so:
            word1:  a   b   c
            word2:    p   q   r
            merged: a p b q c r
*/

class Merge_string{
    public static String mergeString(String word1,String word2){
        StringBuilder sb=new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        int i=0;
        while(i<n1 || i<n2){
            if(i<n1){
                sb.append(word1.charAt(i));
            }
            if(i<n2){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String []args){
        String result=mergeString("abc","pqrs");
        System.out.println(result);
    }
}