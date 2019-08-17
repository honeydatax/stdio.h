#!/usr/bin/awk -f 

BEGIN {
	print "Content-type:text/text\r\n\r"
		iii=1
		printf "2 ^ 0 = %d\n",iii
		iii=2
		for (i=0;i<129;i++){
			printf "%d X %d = %d\n",ii,i,iii
			iii=iii*2
		}
}

