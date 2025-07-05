
/*
Description: Create a Record class to be tested by the TestRecord main class.
             Implement recordName, artist, and yearReleased instance variables,
             Include a empty-argument constructor and three argument constructor.
             Override both toString and equals method inherited from 
             Java's Object class.
Author: Andrew W. Hanson
Date: 11/09/2023
 */

package testrecord;

public class Record {

    // Created private instance variables
    private String recordName;
    private String artist;
    private int yearReleased;

    // Empty-argument constructor
    public Record() {
    }

    // Three-argument constructor named Record, containing the three instance
    // variables names.
    public Record(String recordName, String artist, int yearReleased) {
        this.recordName = recordName;
        this.artist = artist;
        this.yearReleased = yearReleased;
    }

    // Getter and setter methods for recordName
    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    // Getter and setter methods for artist
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Getter and setter methods for yearReleased
    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Record ["
                + "recordName = '" + recordName + "'"
                + ", artist = '" + artist + "'"
                + ", yearReleased = " + yearReleased
                + "]";
    }

    // equals method for testing using class obj.
    // checking the values of the current obj with other obj using instance vars.
    public boolean equals(Record other) {
        return ((recordName.equals(other.recordName))
                && (artist == other.artist) && (yearReleased == other.yearReleased));
    }
}