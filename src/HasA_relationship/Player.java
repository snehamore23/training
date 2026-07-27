package HasA_relationship;

public class Player {

	String name;
	int age;
	String role;
	Team team;
	
	public  Player(String name, int age, String role,Team team ) {
		this.name=name;
		this.age=age;
		this.role=role;
		this.team=team;
	}
		public void displayPlayer() {
			System.out.println("player name: "+ name);
			System.out.println("age: "+ age);
			System.out.println("role: "+ role);
		
	}
	public static void main(String[] args) {
		Team t1=new Team("MI","xyz", 1, "India");
		Player p1 =new Player("Rohit sharma", 21, "captain",t1);

	p1.displayPlayer();
	System.out.println("************************************************");
	t1.displayTeam();
	t1.updateranking(5);

}
}
