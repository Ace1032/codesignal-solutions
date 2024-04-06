/**
You are given an array of up to four non-negative integers, each less than 256.

Your task is to pack these integers into one number M in the following way:

The first element of the array occupies the first 8 bits of M;
The second element occupies next 8 bits, and so on.
Return the obtained integer M.

Note: the phrase "first bits of M" refers to the least significant bits of M - the right-most bits of an integer. For further clarification see the following example.

Example

For a = [24, 85, 0], the output should be
arrayPacking(a) = 21784.

An array [24, 85, 0] looks like [00011000, 01010101, 00000000] in binary.
After packing these into one number we get 00000000 01010101 00011000 (spaces are placed for convenience), which equals to 21784.

**/
/* package whatever; // don't place package name! */

import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int []a = {24, 85, 0};
        System.out.println(arrayPacking(a));
    }
    
    public static int arrayPacking(int[] a) {
        String bit="";
        for(int i=0;i<=a.length-1;i++ ){
            
            bit=bit+convertToBinarry(a[i]);
        }
        System.out.println(convertToDecimal(bit));
        return 0;
    }
    public static int convertToDecimal(String bit){
        int result=0;
        char[] bitArray=bit.toCharArray();
        for(int i=0; i<bit.length(); i++){   
            result =result+ Character.getNumericValue(bitArray[i])*(int)Math.pow(2,i);
            }
        return result;
        
    }
    public static String convertToBinarry(int n){
        char[] bit={'0','0','0','0','0','0','0','0'}; int i=0;
         while(n>0){    bit[i]=Integer.toString(n%2).charAt(0);    n=n/2;   i++;}
        return String.valueOf(bit);
    }
}