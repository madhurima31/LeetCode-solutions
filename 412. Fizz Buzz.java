/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
*/
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            String resultStr="";
            if(i%3==0){
                resultStr+="Fizz";
            }
            if(i%5==0){
               resultStr+="Buzz";
            }
            if(resultStr==""){
                resultStr+=Integer.toString(i);
            }
            result.add(resultStr);
        }
        return result;
    }
}
