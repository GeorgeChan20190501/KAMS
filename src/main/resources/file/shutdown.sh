#!/bin/bash

echo ".......KAMS stop start......."

ID=`ps -ef | grep "KAMS.jar" | grep -v "grep" | awk '{print $2}'`

cho $ID

for id in $ID
do

kill -9 $id

echo "killed $id"

done

sleep 5s

echo ".......KAMS stop end......."
