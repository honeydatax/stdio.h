#!/usr/bin/awk -f
BEGIN {
printf "Content-type:text/html\r\n\r\n"
printf "<html><head><title>lua server</title></head><body><h1>"
printf "hello world from awk.!\n"
printf "</h1></body></html>"
}
