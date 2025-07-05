
/*
Description: Create a PopRecord class that extends (inherits from)
             the Record class. 
             Add an instance variable called genre, create the appropriate 
             set and get method. 
             Add appropriate constructors, then override both the
             toString and equals methods.
Author: Andrew W. Hanson
Date: 11/14/2023
 */

package testrecord;

public class PopRecord extends Record {

    private String genre;

    // Empty-argument constructor
    public PopRecord() {
    }

    // Constructor with genre
    public PopRecord(String recordName, String artist, int yearReleased, String genre) {
        super(recordName, artist, yearReleased);
        this.genre = genre;
    }

    // Getter and setter methods for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Override toString method
    @Override
    public String toString() {
        return "PopRecord ["
                + "recordName = '" + getRecordName() + "'"
                + ", artist = '" + getArtist() + "'"
                + ", yearReleased = " + getYearReleased()
                + ", genre = '" + genre + "'"
                + "]";
    }

    // Equals method using class PopRecord, check
    // Super.equals other r, recognizing as Record.
    // And checking if the genre == to the same genre.
    // If does, return true. Else, return false.
    public boolean equals(PopRecord r) {

        if (super.equals(r) && (genre == genre)) {
            return true;
        } else {
            return false;
        }
    }
}