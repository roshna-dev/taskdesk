package com.streamify.music.catalog;
import com.streamify.music.models.Song;
import com.streamify.music.utils.SongPrinter;

public class CatalogDemo {
    public static void main(String[] args) {
        Song song=new Song("Blinding Lights", 120);
        song.printSummary();
        SongPrinter.printGenre(song);
    }
}
