#! /bin/bash

clear

sudo mkdir /mnt/ramdisk > /dev/null
sudo mount -t tmpfs -o size=8m tmpfs /mnt/ramdisk