#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(){
	printf("Content-type:text/txt\r\n\r\n");
	printf("same message as been recived by server\n\n");
	chdir("cgi-bin\0");
	system("appletviewer alert.html\0");
	}
