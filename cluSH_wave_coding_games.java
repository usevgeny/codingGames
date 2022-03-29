import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
            
        }
        String fill = in.nextLine();
        String empty = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        System.out.println(fill);
    }
}


/*

The goal is to draw a triangle wave in a 2d graph, given that h is the height of the graph and w defines the horizontal range of the graph.

The wave should start from the middle left and proceed diagonally up to the top of the graph, then diagonally down, etc.
Note: amplitude = (h-1) / 2

The following rules should be applied:
1- h must be odd 
2- w and h should be at least 1
If either rule is broken output should be: Invalid Input
Entrée
Line 1: Two space separated Integers, width w and height h
Line 2: Character fill to represent the wave
Line 3: Character empty to represent empty spaces
Sortie
h lines with a width of w that represents a triangle wave. Use fill for the wave and empty for the space.
or Invalid Input
Contraintes
-100 ≤ w,h ≤ 100
*/