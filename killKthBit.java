/**
In order to stop the Mad Coder evil genius you need to decipher the encrypted message he sent to his minions. The message contains several numbers that, when typed into a supercomputer, will launch a missile into the sky blocking out the sun, and making all the people on Earth grumpy and sad.

You figured out that some numbers have a modified single digit in their binary representation. More specifically, in the given number n the kth bit from the right was initially set to 0, but its current value might be different. It's now up to you to write a function that will change the kth bit of n back to 0.

Example

For n = 37 and k = 3, the output should be
killKthBit(n, k) = 33.

3710 = 1001012 ~> 1000012 = 3310.

For n = 37 and k = 4, the output should be

killKthBit(n, k) = 37.

The 4th bit is 0 already (looks like the Mad Coder forgot to encrypt this number), so the answer is still 37.
**/
import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(killKthBit(37,3));
    }
    
    
    public static int killKthBit(int n, int k) {
        String bit=""; 
        int result=0;
        
        while(n>0){    bit=bit +n%2;    n=n/2;}
        char[] bitArray=bit.toCharArray();
        if(bitArray[(bit.length()-1)-k]=='1')bitArray[(bit.length()-1)-k]='0';
        else bitArray[(bit.length()-1)-k]='1';
        
        for(int i=0; i<bit.length(); i++){   
            result =result+ Character.getNumericValue(bitArray[i])*(int)Math.pow(2,i);
            }
        
      return result ;
    }
    
}