/*Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 Example 1:

            Input: s = "IceCreAm"
            Output: "AceCreIm"

Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm". */


public class Reverse_vowel {
    public static String reverseVowels(String s){
        char []arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        String isVowel="aeiouAEIOU";
        while(i<j){
            while(i<j){
                char ch=arr[i];
                if(isVowel.indexOf(ch) !=-1){
                    break;
                }
                i++;
            }
            while(i<j){
                char ch=arr[j];
                if(isVowel.indexOf(ch) !=-1){
                    break;
                }
                j--;
            }
            if(i<j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public static void main(String []args){
        String result=reverseVowels("IceCreAm");
        System.out.println(result);
    }
}
