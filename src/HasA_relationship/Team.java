package HasA_relationship;

public class Team {

	String teamName;
	String coach;
	int ranking;
	String country;
	
	public void playMatch() {
		System.out.println("players ");
		
	}
	public void updateranking(int ranking) {
		ranking+=ranking;
		
		System.out.println("Updated Ranking: " + ranking);
	}
	public Team(String teamName, String coach,int ranking, String country) {
		this.teamName=teamName;
		this.coach=coach;
		this.ranking=ranking;
		this.country=country;
	}
	public void displayTeam() {
		System.out.println("team name: "+ teamName);
		System.out.println("coach: "+ coach);
		System.out.println("ranking: "+ ranking);
		System.out.println("country: "+ country);
	}
	public static void main(String[] args) {
		
	

	}

}
