//  Description: Abstract class from which MagicForest creatures are derived.
//  Author:      Michael R. Scheessele
//  Date:        November 30th, 2022
package creaturetest;

public abstract class MagicForestObject {

    private int x;
    private int y;

    MagicForestObject() {
        x = 0;
        y = 0;
    }

    MagicForestObject(int x, int y) {
        // No need to throw an exception.
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }

        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        // No need to thor wna exception.
        if (x < 0) {
            x = 0;
        }

        this.x = x;
    }

    public void setY(int y) {
        // No need to throw exception
        if (y < 0) {
            y = 0;
        }

        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Each creature has some "vocalization".
    // Abstract method must be overriden by concrete subclassses.
    public abstract void vocalize();
}