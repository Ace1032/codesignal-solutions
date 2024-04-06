int isSumOfConsecutive2(int n) {
    int count=0;
    for(int i=1; i<n;i++){
        int sum=0;
        int k=i;
        while(sum<=n){
            sum=sum+k;
            if(sum==n)
               count++;
            k++;
        }
    }
    return count;
}