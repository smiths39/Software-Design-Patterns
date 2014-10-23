import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

	/* 
	 * Create a Hashtable with an int as a key and SongInfo Objects
	 */
	Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();
	
	/*
	 * Will increment the Hashtable key
	 */
	int hashKey = 0;
	
	public SongsOfThe90s() {
		
		addSong("Smells Like Teen Spirit", "Nirvana", 1991);
		addSong("Everlong", "Foo Fighters", 1997);
		addSong("My Name Is", "Eminem", 1999);
	}
	
	/*
	 * Add a new SongInfo Object to the Hashtable and then increment the Hashtable key
	 */
	public void addSong(String songName, String bandName, int yearReleased) {
		
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs.put(hashKey, songInfo);
		hashKey++;
	}

	/* 
	 * By adding this method I'll be able to treat all collections the same
	 */
	public Iterator createIterator() {
	
		return bestSongs.values().iterator();
	}
}
