
/*
Description: Tester class for the two classes named: PopRecord and Record.
Author: Andrew W. Hanson
Date: 11/09/2023
*/

package testrecord;

public class TestRecord {

    public static void main(String[] args) {
        // Testing Record class
        Record record1 = new Record("Album1", "Artist1", 2020);
        Record record2 = new Record("Album1", "Artist1", 2020);
        
        System.out.println("Record1: " + record1);
        System.out.println("Record2: " + record2);
        System.out.println("Record1 equals Record2: " + record1.equals(record2));
        
        System.out.println("\n");
        
        // Testing PopRecord class
        PopRecord popRecord1 = new PopRecord("PopAlbum4", "PopArtist4", 2013, "Pop");
        PopRecord popRecord2 = new PopRecord("PopAlbum1", "PopArtist1", 2019, "Pop");
        
        System.out.println("PopRecord1: " + popRecord1);
        System.out.println("PopRecord2: " + popRecord2);
        System.out.println("PopRecord1 equals PopRecord2: " + popRecord1.equals(popRecord2));
    }
}