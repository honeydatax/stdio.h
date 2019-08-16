#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>


int main(){
	char ss[512];
	char s[255];
	printf("Content-type:text/text\r\n\r\n\r\n\r");
	strcpy(ss,"/usr/bin/awk 'BEGIN { print (");
	strcpy(s,getenv("QUERY_STRING"));
	printf("\n\n\n%s = \n\n\n\n",s);
	strcat(ss,s);
	strcat(ss," ) } '\0");
	system(ss);
	}
