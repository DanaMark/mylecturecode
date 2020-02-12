

import java.util.ArrayList;


public class TestTeamAndLeague {

	
	public static void main(String[] args) {
		ArrayList<Team> arrTeam = new ArrayList<>();
		
		
		
		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		Team dinamo = new Team("DINAMO");
		Team metalurg = new Team("METALURG");
		Team spartak = new Team("SPARTAK");
		Team vytjaz = new Team ("VYTJAZ");
		arrTeam.add(ska);
		arrTeam.add(cska);
		arrTeam.add(dinamo);
		arrTeam.add(metalurg);
		arrTeam.add(spartak);
		arrTeam.add(vytjaz);
		
		for(Team t : arrTeam){
			System.out.println(t.getName());
		}
			
		
		League khl = new League("KHL");
		//khl.nameOfTeam.add(cska);
		
		//khl.setNameOfTeam.add(cska);
		
		
		khl.recordWinAndLoss("CSKA", "DINAMO");
		khl.recordWinAndLoss("SKA", "DINAMO");
		khl.recordWinAndLoss("SPARTAK", "SKA");
		khl.setNameOfTeam(arrTeam);
		khl.recordWinAndLoss("METALURG", "VYTJAZ");
		
		System.out.println(khl.toString());
		System.out.println("Team SKA total points: " +ska.totalPoints());
		
	}
}
