import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
	
	/*
	 * Create an array of SongInfo Objects
	 */
	SongInfo [] bestSongs;
	
	/*
	 * Used to increment to the next position in the array
	 */
	int arrayValue = 0;
	
	public SongsOfThe80s() {
		
		bestSongs = new SongInfo[3];
		addSong("Ace Of Spades", "Motorhead", 1980);
		addSong("Welcome To The Jungle", "Guns N' Roses", 1987);
		addSong("The One I Love", "REM", 1988);
	}
	
	/* 
	 * Add a SongInfo Object to the array and increment to the next position
	 */
	public void addSong(String songName, String bandName, int yearReleased) {
		
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs[arrayValue] = songInfo;
		arrayValue++;
	}
	
	/* 
	 * By adding this method I'll be able to treat all collections the same
	 */
	public Iterator createIterator() {

		return Arrays.asList(bestSongs).iterator();
	}
}
