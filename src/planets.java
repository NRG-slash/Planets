import java.util.Scanner;
/**
 *
 * Name: Laturski, Garrett William
 * Teacher: Mr.Hardman
 * Assignment #3
 * Date Last Modified: 
 *
 */
public class planets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		double weight;
		double spaceWeight;
		String celestialBody;
		
		System.out.print("What's your weight? ");
		weight = userInput.nextDouble();
		
		System.out.print("What celestial body do you want to go to? ");
		celestialBody = userInput.next();
		
		if(celestialBody.equalsIgnoreCase("Mercury") ){
			spaceWeight = weight * 0.38;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
		}
		else if(celestialBody.equalsIgnoreCase("Venus") ){
			spaceWeight = weight * 0.91;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
		}
	
		else if(celestialBody.equalsIgnoreCase("Earth") ){
			spaceWeight = weight;
			
			System.out.print("You're all ready on this celestial body so you still weigh " + weight);
		}
		
		else if(celestialBody.equalsIgnoreCase("Moon") ){
			spaceWeight = weight * 0.165;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
			
		}
	
		else if(celestialBody.equalsIgnoreCase("Mars") ){
			spaceWeight = weight * 0.38;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
			
		}
	
		else if(celestialBody.equalsIgnoreCase("Jupiter")){
			spaceWeight = weight * 2.34;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
			
		}
	
		else if(celestialBody.equalsIgnoreCase("Saturn")){
			spaceWeight = weight * 1.06;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
			
		}
	
		else if(celestialBody.equalsIgnoreCase("Uranus")){
			spaceWeight = weight * 0.92;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
			
		}
	
		else if(celestialBody.equalsIgnoreCase("Neptune")){
			spaceWeight = weight * 1.19;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
			
		}
	
		else if(celestialBody.equalsIgnoreCase("Pluto")){
			spaceWeight = weight * 0.06;
			
			System.out.print("On this celestial body you will weigh " + spaceWeight);
			
		}
		
		userInput.close();
		
	}
	
}