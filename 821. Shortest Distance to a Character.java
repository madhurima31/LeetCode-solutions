/*
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
*/
class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        ArrayList<Integer> indexesOfC= new ArrayList<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)== C){
                indexesOfC.add(i);
            }
        }
        int e=1;
        if(indexesOfC.size()==1){
            for(int j=0;j<S.length();j++){
                if(j<indexesOfC.get(0)){
                    result[j]= indexesOfC.get(0) -j;
                }
                else{
                    result[j]= j- indexesOfC.get(0);
                }
            }
        }
        else{
            for(int j=0;j<S.length();j++){
                     result[j]= Math.min(Math.abs(j-indexesOfC.get(e-1)),Math.abs(j-indexesOfC.get(e)));
                if(j>=indexesOfC.get(e) && e+1 <=indexesOfC.size()-1){
                    e++;
                }
            }
        }

        return result;
    }
}
