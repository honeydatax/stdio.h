#!/usr/bin/awk -f

BEGIN {
	print "Content-type:text/text\r\n\r"
	for (i=0;i<10;i++){
		print int(rand()*49)+1
	}
	
}

