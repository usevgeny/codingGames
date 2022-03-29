# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

# n: the number of temperatures to analyse
read -r n
read -r -a myArray
for (( i=0; i<$n; i++ )); do
    # t: a temperature expressed as an integer ranging from -273 to 5526
    t=${myArray[$((i))]}
done

ETALON=0
ARRAYLEN=${#myArray[@]}
if [[ ${ARRAYLEN} -ne 0 ]]
then 
ETALON=${myArray[1]}
fi

for (( i=0; i<$ARRAYLEN; i++ ))

do 
    ELEMENT=${myArray[$i]}
    if [[ $((ETALON**2)) -gt $((ELEMENT**2)) ]]
        then
        ETALON=$ELEMENT
        elif [[ $ELEMENT -gt 0 ]] && [[ $((ETALON**2)) -eq $((ELEMENT**2)) ]]
        then
        ETALON=$ELEMENT
    fi


done

# Write an answer using echo
# To debug: echo "Debug messages..." >&2

echo $ETALON