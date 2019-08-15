#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>


int main(){
	char ss[512];
	char s[255];
	strcpy(ss,"java restart ");
	chdir("cgi-bin\0");
	system(ss);
	}
