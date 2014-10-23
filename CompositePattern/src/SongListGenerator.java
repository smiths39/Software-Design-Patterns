public class SongListGenerator {

	public static void main(String [] args) {
		
		SongComponent industrialMusic = new SongGroup("Industrial", "is a style of experimental music that draws on transgressive and provacative themes");
		SongComponent heavyMetalMusic = new SongGroup("\nHeavy Metal", "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");
		SongComponent dubstepMusic = new SongGroup("\nDupstep", "is a genre of electronic dance music that originated in South London, England");
		
		/*
		 *  Top level component that holds everything
		 */
		SongComponent everySong = new SongGroup("Song List", "Every Song Available");
		
		/* 
		 * Composite that holds individual groups of songs 
		 * This holds Songs plus a SongGroup with Songs
		 */
		everySong.add(industrialMusic);
		industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
		industrialMusic.add(new Song("Mein Tier", "Rammstein", 1997));
		
		industrialMusic.add(dubstepMusic);
		dubstepMusic.add(new Song("Monsters", "Skrillex", 2011));	
		dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
		
		/*
		 * This is a SongGroup that just holds Songs
		 */
		everySong.add(heavyMetalMusic);
		heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));
		heavyMetalMusic.add(new Song("Master of Puppets", "Metallica", 1986));
		
		DiscJockey crazyLarry = new DiscJockey(everySong);
		crazyLarry.getSongList();
	}
}
