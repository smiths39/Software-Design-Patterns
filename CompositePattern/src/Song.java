import java.util.Iterator;

public class Song extends SongComponent {

	String songName;
	String bandName;
	int releaseYear;
	
	public Song(String newSongName, String newBandName, int newReleasedYear) {
		
		songName = newSongName;
		bandName = newBandName;
		releaseYear = newReleasedYear;
	}
	
	public String getSongName() { return songName; }
	public String getBandName() { return bandName; }
	public int getReleaseYear() { return releaseYear; }
	
	public void displaySongInfo() {
		
		System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear());
		
	}
	
}
