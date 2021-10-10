package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Song s1 = new Song("Billie Jean", 10, true);
		Song s2 = new Song("I Want to Hold Your Hand", 12, true );
		Song s3 = new Song("In the Summertime", 30, false );
		Song s4 = new Song("All I Want for Christmas Is You", 16, false );
		Song s5 = new Song("Wind of Change", 15, true );
		Song s6 = new Song("Y.M.C.A.", 12, true );
		
		List<Song> songs = Arrays.asList(s1, s2, s3, s4, s5, s6);
		
		Predicate<Song> bigSale =
				s -> s.salesInMillion >= 13;
		Predicate<Song> isHit =
				s -> s.hit;
		Function<Song, String> success = 
				s -> s.title +" was a great success!";
				
		songs.stream()
			.filter(bigSale)
			.filter(isHit)
			.map(success)
			.forEach(System.out::println);

	}

}
