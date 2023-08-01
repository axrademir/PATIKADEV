
public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("azra", 15, 200, 60,30);
		Fighter f2 = new Fighter("zeynep", 10, 240, 50,40);
		
		Match match = new Match(f1, f2, 100, 40);
		match.run();
		
		
		

	}

}
