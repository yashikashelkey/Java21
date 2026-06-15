package javabasics;

public class Cricket {
	
	int numberOfPlayers = 11;
	String name = "India";
	int overs = 20;
	float weightOfBall = 163;
	String TournamentType = " ICC T20 World Cup";
	int century = 100;
	boolean isBigTournament = true;
	String ballType = "Red ball and white ball";
	int pitch = 22;
	int numberOfTeams = 2;
	
	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		String name = cricket.name;
		System.out.println("The name of team is"+ name);
		int overs = cricket.overs;
		System.out.println("The overs : " + overs);
		float weightOfBall = cricket.weightOfBall;
		System.out.println("The weight of ball is : " + weightOfBall + "g");
		String tournamentType = cricket.TournamentType;
		System.out.println("The type of tournament is : " + tournamentType);
		int century = cricket.century;
		System.out.println(century);
		boolean isBigTournament = cricket.isBigTournament;
		System.out.println(isBigTournament);
		String ballType = cricket.ballType;
		System.out.println("The type of balls used : " + ballType);
		int pitch = cricket.pitch;
		System.out.println(pitch + "yards");
		int numberOfTeams = cricket.numberOfTeams;
		System.out.println("The number of teams " + numberOfTeams);
		
	}

	/**
	 * @return the name
	 */
	private String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}
}
