/*
Reverse the order of the bits in a given integer.

Example

For a = 97, the output should be
mirrorBits(a) = 67.

97 equals to 1100001 in binary, which is 1000011 after mirroring, and that is 67 in base 10.

For a = 8, the output should be
mirrorBits(a) = 1.
*/

import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(mirrorBits(97));
    }
    public static int mirrorBits(int a) {
        return convertToDecimal(stringMirror(convertToBinarry(a)));
    }
    public static String convertToBinarry(int n){
       String bit=""; 
        while(n>0){    bit=bit +n%2;    n=n/2;}
        return bit;
    }
    public static String stringMirror(String bit){
        char[] bitArray=bit.toCharArray();
        bit="";    int p=bitArray.length-1;
        for(int i=0; i<=bitArray.length-1;i++){
            bit=bit+ String.valueOf(bitArray[p]);
            p--;
        }
        return bit;
    }
     public static int convertToDecimal(String bit){
        int result=0;
        char[] bitArray=bit.toCharArray();
        for(int i=0; i<bit.length(); i++){   
            result =result+ Character.getNumericValue(bitArray[i])*(int)Math.pow(2,i);
            }
        return result;
        
    }
}
