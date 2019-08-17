#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>


void head();
void tail();
void spaces(char* c, char* cc);


int main(){
	long long i;
	long long ii;
	long long iii;
	long long iiii;
	int a;
	char ssss[9000];
	char ss[9000];
	char s[9000];
	char sss[9000];
	FILE *f1;
	head();
	chdir("cgi-bin\0");
	strcpy(s,getenv("QUERY_STRING"));
	printf("<p> %s  </p>\n",s);
    strcpy(ss,"awk 'BEGIN{ print ");
    //spaces(s,sss);
    strcat(ss,s);
	strcat(ss," } ' > stdout ");
    system(ss);
	f1=fopen("stdout","r");
	i=ftell(f1);
	fgets(s,255,f1);
	fclose(f1);
	printf("<p> = %s  </p>\n",s);
    tail();
	}

// head html http
void head(){
	printf("Content-type:text/html\r\n\r\n");
	printf("<html<head><title>c server</title></head><body><h1> \n\n");
	}


// tail html http	
void tail(){
	printf("</h1></body></html \n\n");
	}


void spaces(char* c, char* cc){
	int i;
	int ii;
	int iii;
	
	ii=512;
	iii=0;
	for (i=0;i<ii;i++){
		cc[ii]=c[i];
		if (c[i]=='+' || c[i]=='-' || c[i]=='/') {
			cc[iii]=' ';
			iii++;
			cc[iii]=c[i];
			iii++;
			cc[iii]=' ';
			iii++;
		}

		if (c[i]=='*') {
			cc[iii]=' ';
			iii++;
			cc[iii]='\\';
			iii++;
			cc[iii]='*';
			iii++;
			cc[iii]=' ';
			iii++;
		}
		if (c[i]!='+' && c[i]!='-' && c[i]!='/' && c[i]!='*') {
			cc[iii]=c[i];
			iii++;
		}
		
		if (c[i]==0) {
			i=513;
		}
	}
}
