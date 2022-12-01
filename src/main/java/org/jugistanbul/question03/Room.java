package org.jugistanbul.question03;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 */

public class Room implements AutoCloseable{

    int numJunkPiles; // Number of junk piles in this room

    public Room(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }

    @Override
    public void close()  {
        System.out.println("Oda temizlendi");
        this.numJunkPiles = 0 ;
    }
}
