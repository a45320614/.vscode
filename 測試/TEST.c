
void main(void){
	char canvas[50][50];
	int i,j,x,y,z[2];
	for(i=0;i<50;i++){
		for(j=0;j<50;j++){
			canvas[i][j]=' ';
		}
	}
	coord_convert(25,25,z);
}
void coord_convert(int a,int b,int *ptr){
	*ptr={a,b};
}