#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(){
	chdir("cgi-bin\0");
	system("java data\0");
	}
