import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

	/*
	 * Passing in song iterators
	 */
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	/*
	 * Initialize the iterators
	 */
	public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
	
		iter70sSongs = newSongs70s;
		iter80sSongs = newSongs80s;
		iter90sSongs = newSongs90s;
	}

	/*
	 *  Now that I can treat everything as an Iterator it cleans up the code while allowing me to treat all collections as 1
	 */
	public void showTheSongs() {
		
		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s);
		
		System.out.println("\nSongs of the 80s\n");
		printTheSongs(songs80s);
		
		System.out.println("\nSongs of the 90s\n");
		printTheSongs(songs90s);
	}
	
	public void printTheSongs(Iterator iterator) {
		
		while (iterator.hasNext()) {
			SongInfo songInfo = (SongInfo) iterator.next();
		
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());
		}
	}
}
