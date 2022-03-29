import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
temperatures = []
n = int(input())  # the number of temperatures to analyse
for i in input().split():
    # t: a temperature expressed as an integer ranging from -273 to 5526
    t = int(i)
    temperatures.append(t)

etalon=0
if len(temperatures)!=0:
        etalon=temperatures[0]

for tem in temperatures:
        if tem<0 and abs(etalon)>abs(tem):
                etalon=tem
        elif tem>0 and abs(etalon)>tem:
            etalon=tem
        elif tem==abs(etalon):
            etalon=tem


# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)

print(etalon)
