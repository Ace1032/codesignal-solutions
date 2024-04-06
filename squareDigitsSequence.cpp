/**
Consider a sequence of numbers a0, a1, ..., an, in which an element is equal to the sum of squared
 digits of the previous element. The sequence ends once an element that has already been in the 
 sequence appears again.

Given the first element a0, find the length of the sequence.

Example

For a0 = 16, the output should be

squareDigitsSequence(a0) = 9.

Here's how elements of the sequence are constructed:

a0 = 16
a1 = 12 + 62 = 37
a2 = 32 + 72 = 58
a3 = 52 + 82 = 89
a4 = 82 + 92 = 145
a5 = 12 + 42 + 52 = 42
a6 = 42 + 22 = 20
a7 = 22 + 02 = 4
a8 = 42 = 16, which has already occurred before (a0)
Thus, there are 9 elements in the sequence.

For a0 = 103, the output should be

squareDigitsSequence(a0) = 4.

The sequence goes as follows: 103 -> 10 -> 1 -> 1, 4 elements altogether.


**/
#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

int ckeckList(vector<int> aSequence, int n);
int squareDigitsSequence(int a0) {
    vector<int> aSequence;
    aSequence.push_back(a0);
    int sequance=0;
    while(ckeckList(aSequence, a0)<2){    
    int sum=0;
    while(a0>0){
        sum= sum+pow(a0%10,2);
        a0=a0/10;
    }
    aSequence.push_back(sum);
    a0=sum;
    sequance++;
   }
    return sequance+1;
}


int ckeckList(vector<int> aSequence, int n){
    int total=0;
    for(int i=0; i<aSequence.size(); i++){
        if(aSequence[i]==n)
            total++;
    }
    return total;
}

int main() {
    cout<<squareDigitsSequence(103);
    return 0;
}