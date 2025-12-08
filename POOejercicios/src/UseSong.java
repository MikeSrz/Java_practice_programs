import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class UseSong {
	
	public static void printObjectList(ArrayList<Song> songList) {
		for (Song s : songList) {
			System.out.println(s.toString());		
			}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader;
		String line;
		String songName;
		String artist;
		ArrayList<Song> songs = new ArrayList<>();
		Path relativePath;
		
		relativePath = Path.of("src","canciones.txt");
		if (Files.notExists(relativePath)) {
			System.out.println("No existe el fichero canciones.txt");
		}
		else {
			reader = new BufferedReader(new FileReader(relativePath.toFile()));		
			line = reader.readLine();
			while (line != null) {
				songName = line.split(":")[0].trim();
				artist = line.split(":")[1].trim();
				songs.add(new Song(songName, artist));
				line = reader.readLine();
			}
			reader.close();
			ArrayList<Song> sortedSongsByAuthor = new ArrayList<>(songs);
			ArrayList<Song> sortedSongsByTitle = new ArrayList<>(songs);
			
			Collections.sort(sortedSongsByAuthor);
			Collections.sort(sortedSongsByTitle, new ComparatorByTitle());
			
			System.out.println("|Ordenados por autor|");
			printObjectList(sortedSongsByAuthor);
			System.out.println("|Ordenados por título|");
			printObjectList(sortedSongsByTitle);
		}
		
	}
}


