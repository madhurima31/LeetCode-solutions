/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.

*/
class Solution {
    public String reverseWords(String s) {
        StringBuilder resultString = new StringBuilder();
        String[] splited = s.split(" ");
        for(int i=0;i<splited.length;i++){
            StringBuffer rev= new StringBuffer(splited[i]);
            resultString.append(rev.reverse()+" ");
        }
        return resultString.toString().trim();
    }
}
