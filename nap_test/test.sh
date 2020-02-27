#! /bin/bash

if [ "$1" == "" ];
then
    echo "Usage: ./test.sh directory-with-examples syntactic-category [-v]"
    echo "  syntactic-catogery in expr, instruction, block"
    echo "                        function_definition, program"
    echo "  -v: for verbose output"
    exit 0
fi

grun='java org.antlr.v4.gui.TestRig'
nonterminal=$2
counter=0
suffix="${nonterminal:0:3}"
for exp in $1/*.$suffix; do
    echo "--------------------------"
    echo "File:" $(basename -a $exp)
    echo "To Parse: " "$(cat $exp)"
    rm -f error
    $grun parser.nap $2 -tree $exp > tree 2> error
    echo -n "Test result: "
    if [ -s error ];
    then
	echo "Failed"
	counter=$(expr $counter + 1)
    else
	echo "Success"
    fi
    if [ "$3" == "-v" ];
    then
	cat error
	cat tree
    fi
done

echo "======================================"
echo "Tests:  " $(ls -l $1/*.$suffix | wc -l)
echo "Failed: " $counter
echo "======================================"
