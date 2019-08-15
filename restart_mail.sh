#!/bin/bash
echo "Adim then server as restart.!:the server restart or starts\n for start up or same serias error." > cgi-bin/restart.dat
mail -s "Adim then server as restart.!" "AdimUser1@gmail.com" <  cgi-bin/restart.dat
mail -s "Adim then server as restart.!" "AdimUser2@gmail.com" <  cgi-bin/restart.dat
