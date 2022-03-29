# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
# ---
# Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.

# lightX: the X position of the light of power
# lightY: the Y position of the light of power
# initialTX: Thor's starting X position
# initialTY: Thor's starting Y position
read -r lightX lightY initialTX initialTY
thorX=$initialTX
thorY=$initialTY
# game loop
while true; do
    movX=""
    movY=""
    # remainingTurns: The remaining amount of turns Thor can move. Do not remove this line.
    read -r remainingTurns
    if [[ "$thorX" -gt "$lightX" ]]
    then
    movX="W"
    thorX=$((thorX + 1))
    elif [[ "$thorX" -lt "$lightX" ]]
    then
    movX="E"
    thorX=$((thorX - 1))
    fi

    if [[ "$thorY" -gt "$lightY" ]]
    then
    movY="N"
    thorY=$((thorY - 1))
    elif [[ "$thorY" -lt "$lightY" ]]
    then
    movY="S"
    thorY=$((thorY + 1))
    fi
    echo "$movY$movX"
done