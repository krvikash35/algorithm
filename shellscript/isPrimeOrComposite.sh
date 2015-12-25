#!/bin/bash


if [ $# -lt 1 ]
  then
  echo "Please provide number as parameter"
  exit 1
fi

for testData in $@
do
  if ! [[ $testData =~ ^[0-9]+$ ]]
    then
    echo $testData": is Invalid Number"
    continue;
  fi
  if [ $testData -eq 0 -o $testData -eq 1 ]
    then
    echo $testData": is neither Prime nor Composite Number" ;
    continue;
  fi
  if [ $testData -eq 2 -o $testData -eq 3 ]
    then
    echo $testData": is  Prime Number"
    continue;
  fi
  divideTill=`expr $testData / 2`
  i=2;
  while [[ $i -le $divideTill ]]; do
    if [[ `expr $testData % $i` -eq 0 ]]; then
      echo $testData": is  Composite Number";
      break;
    fi
    i=`expr $i + 1`
  done
  if [[ $i -gt $divideTill ]]; then
    echo $testData": is  Prime Number";
  fi
done
