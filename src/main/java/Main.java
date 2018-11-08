
public class Main {

	public static void main(String[] args) {
		
	
		Knight knight = new Knight(new DeadIslandQuest());
		knight.processQuest();
		System.out.println(knight.title);
		System.out.println(knight.victory);

		Knight knight1 = new Knight(new EliteKnightQuest());
		knight1.processQuest();
		System.out.println(knight1.title);
		System.out.println(knight1.victory);
		}

}