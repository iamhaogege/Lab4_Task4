package Lab4;

public class Mainprogram {

	public static void main(String[] args) {
		Movie[] movies = new Movie[8];
		movies[0] = new Movie("Mrs.Doubtfire",120);
		movies[1] = new Movie("terminator",107);
		movies[2] = new Movie("Home Alone",103);
		movies[3] = new Movie("Sonic the Hedgehog",98);
		movies[4] = new Movie("Bad Boys for life",124);	
		movies[5] = new Movie("birds of Prey",109);
		movies[6] = new Movie("birds of Prey",106);
		movies[7] = new Movie("My Spy",101);
		for (int i = 0;i < movies.length;i ++) {
			System.out.println(movies[i].toString());
		}

		MovieTheare[] movieTheares = new MovieTheare[8];
		
		movieTheares[0] = new MovieTheare("gd",2);
		movieTheares[1] = new MovieTheare("sgu",3);
		movieTheares[2] = new MovieTheare("sgu",3);
		movieTheares[3] = new MovieTheare("sgu",3);
		movieTheares[4] = new MovieTheare("sgu",3);
		movieTheares[5] = new MovieTheare("sgu",3);
		movieTheares[6] = new MovieTheare("sgu",3);
		movieTheares[7] = new MovieTheare("sgu",3);
		movieTheares[1].setOpeningHours(2);
		for(int i=0;i < movies.length;i++) {
			System.out.println(movieTheares[i].toString());
		}
		
	}
}
