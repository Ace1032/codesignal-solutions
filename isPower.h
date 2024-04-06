bool ispower(int n){
	for(int i=1;i<n/2;i++){
		for(int j=1;j<n/2;j++){
			if(pow(i,j) >n)
				break;
			if(pow(i,j)==n)
				return true;
		}
	}
	return false;
}