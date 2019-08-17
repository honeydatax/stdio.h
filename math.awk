#!/usr/bin/awk -f 

BEGIN {
	print "Content-type:text/text\r\n\r"
	for (ii=0;ii<12;ii++){
		for (i=0;i<12;i++){
			iii=i * ii
			printf "%d X %d = %d\n",ii,i,iii
		}
		printf "---------------------\n\n"
	}
}

