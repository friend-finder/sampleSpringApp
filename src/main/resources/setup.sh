#!/bin/sh

add-apt-repository ppa:webupd8team/java &&
apt-get update &&
apt-get install oracle-java8-installer &&
apt-get install oracle-java8-set-default &&

wget -O /tmp/intellij.tar.gz http://download.jetbrains.com/idea/ideaIC-12.0.4.tar.gz &&
tar xfz /tmp/intellij.tar.gz &&
cd idea-IC-123.169/bin &&
./idea.sh &&


apt-get install mysql-server python-mysqldb &&
cd "$( dirname "${BASH_SOURCE[0]}" )" &&
mysql -u root -p < setup.sql
