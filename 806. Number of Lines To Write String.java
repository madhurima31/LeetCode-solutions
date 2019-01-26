/*
We are to write the letters of a given string S, from left to right into lines.
Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line.
 We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.

Now answer two questions: how many lines have at least one character from S, and what is the width used by the last such line?
Return your answer as an integer list of length 2.
Example :
Input:
widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "bbbcccdddaaa"
Output: [2, 4]
Explanation:
All letters except 'a' have the same length of 10, and
"bbbcccdddaa" will cover 9 * 10 + 2 * 4 = 98 units.
For the last 'a', it is written on the second line because
there is only 2 units left in the first line.
So the answer is 2 lines, plus 4 units in the second line.

*/
class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
            int[] result = new int[2];
        result[0]=1;
        result[1]=0;
        int units=0;
        int index=0;
        for(int i=0;i<S.length();i++){
            index= alphabets.indexOf(S.charAt(i));
            if((units+ widths[index])<=100){
            units=units+ widths[index];
            }
            else{
                result[0]++;
                units=0;
                units=units+widths[index];
            }
        }
        if(units<100){
        result[1]=units;
        }
        else{
           result[0]++;
            result[1]=widths[index];
        }

        return result;
    }
}
