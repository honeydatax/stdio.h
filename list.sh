#!/bin/bash 
cd cgi-bin
ls > out.txt
awk 'BEGIN{print "Content-type:text/html\r\n\r\n<html><head><title>awk server</title></head><body>"}{print $0  "<br>\n" }END{print "<br></body></html>"}' out.txt

