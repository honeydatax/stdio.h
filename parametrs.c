#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>


int main(){
	char ss[512];
	char s[255];
	strcpy(ss,"java parametrs '");
	strcpy(s,getenv("QUERY_STRING"));
	strcat(ss,s);
	strcat(ss,"'\0");
	chdir("cgi-bin\0");
	system(ss);
	}
