import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static class Mountain{
            private int ind;
            private int h;
            public Mountain(int index, int height){
                this.ind = index;
                this.h= height;

            }

            public int getIndex(){
                return this.ind;

            };
              public int getHeight(){
                return this.h;
            };

            }

    public static List<Mountain> mountains = new ArrayList<Mountain>();
    
    public static Comparator<Mountain> MountainComparator = new Comparator<Mountain>() {
            public int compare(Mountain m1, Mountain m2) {
                return m2.getHeight()-m1.getHeight();
            }
        };

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                Mountain m = new Player.Mountain(i,mountainH);
                mountains.add(m);
            
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            Collections.sort(mountains, MountainComparator);

            for(Mountain m: mountains){
                System.out.println(m.getIndex());
            }

           // System.out.println("4"); // The index of the mountain to fire on.
        }
    }
}