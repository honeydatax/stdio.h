#!/usr/bin/awk -f

BEGIN {
	print "Content-type:text/text\r\n\r"
	for (i=0;i<64;i++){
		printf "%d | client %d | %d\n",i,i,i
	}
	
}

