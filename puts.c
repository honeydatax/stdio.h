#define video_address 0xb8000000

int strslen(char *s){
	int pos=0;
	while(s[pos]!=0){
		pos++;
	}
	return pos;
}



void puts(int x,int y,char *c,int color)
{
	int i=0;
	int lens=0;
	int xxx=0;
	int counter=0;
	int far *scr;
	int sizes=2000;
	int colors=color * 256;
	int xx=80*y+x;
	lens=strslen(c);
	xxx=lens+xx;
	if(xxx>sizes){
		xxx=xxx-(sizes-xxx);
	}
	if (xx<sizes){
		scr=(int far *) video_address;
		for(i=xx;i<xxx;i++){
			*(scr + i )=(int)colors+c[counter];
			counter++;
		} 
	}
}

int main(){
	int i=0;
	for(i=0;i<16;i++)
	puts(i,i,"hello world !",0x70);
	return 0;
}
