package lv.danamark;

import lv.danamark.geometricfigures.Circle;
import lv.danamark.next.FootballPlayer;

public class TestJavaMain {

	
	public static void main(String[] args) {
		FootballPlayer player = new FootballPlayer("Ronaldo", "Forward", 7, true, 184, 89);
		Circle figure = new Circle(); 
		
		System.out.println(figure.getColor()+" "+figure.getRadius());
		
		
		player.setName("Ronaldo");
		player.getName(); 
		
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		
		player.setShirtNumber(10);
		
		System.out.println("____________________");
		
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
	}

}
