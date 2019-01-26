/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
*/
class Solution {
    public int findComplement(int num) {
        int result;
        StringBuilder binary= new StringBuilder();
        while(num!=0){
            binary.append(num%2);
            num=num/2;
        }
        binary.reverse();
        StringBuilder resultstr = new StringBuilder();
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                resultstr.append(0);
            }
            else{
                resultstr.append(1);
            }
        }
        result = Integer.parseInt(resultstr.toString(),2);
        return result;
    }
}
