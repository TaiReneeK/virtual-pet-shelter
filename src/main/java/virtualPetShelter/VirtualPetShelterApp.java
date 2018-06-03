package virtualPetShelter;
import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

		Pets Masai = new Pets("Masai: ", "Straight out of Tanzania; He loves to eat Acacia leaves!",
				85, 60, 70);
		Pets Rothschild = new Pets("Rothschild: ", "From Kenya; has anxiety and hates Acacia leaves but loves Mimosa leaves!", 
				45, 60, 80);
		Pets Nori = new Pets("Nori: ", "Abandoned in North Africa, she is extremely beautiful and loves Apricot leaves!",
				50, 90, 80);
		Pets Kordo = new Pets("Kordo: ", "Picked up in Cameroon, he is tough and stubborn but will eat anything!", 
				50, 70, 40);

		myVirtualPetShelter.returnPet(Masai);
		myVirtualPetShelter.returnPet(Rothschild);
		myVirtualPetShelter.returnPet(Nori);
		myVirtualPetShelter.returnPet(Kordo);
		
		System.out.println("Welcome to the Giraffe Adoption Center!");
		System.out.println("Here are out current adoptees!");
		System.out.println();
		myVirtualPetShelter.showPets();
		
		String choice;
		
		do
		{
			System.out.println();
			System.out.println("Please take good care of our giraffes!");
			System.out.println();
			System.out.println("What would you like to do?");
			
			System.out.println("Type \"Happiness\" to choose a giraffe to feed");
			System.out.println("Type \"Beauty\" to bathe the giraffes");
			System.out.println("Type \"Health\" to take the giraffes for a checkup");
			System.out.println("Type \"Adopt\" to take home a giraffe");
			System.out.println("Type \"Return\" to put a giraffe up for adoption");
			System.out.println("Type \"Exit\" to neglect the giraffes");
			choice = input.next();
			
			if (choice.equalsIgnoreCase("Happiness"))
			{
				System.out.println();
				System.out.println("Which pet would you like to feed");
				System.out.println("Masai, Nori, Rothschild, or Kordo");
				String giraffeName = input.next();
				myVirtualPetShelter.feedPet(giraffeName);

				
				System.out.println("You fed " + giraffeName + " their favorite food!");
				
			}
			
			else if(choice.equalsIgnoreCase("Beauty"))
			{
				for (Pets current : myVirtualPetShelter.getAllPets())
				{
					current.tick();
					current.batheAll();
				}
			}
			
			else if(choice.equalsIgnoreCase("Health"))
			{
				for (Pets current : myVirtualPetShelter.getAllPets())
				{
					current.tick();
					current.checkupAll();
					System.out.println("The giraffes are healthier now that they've been to the vet!");
				}
			}
			
			else if(choice.equalsIgnoreCase("Adopt"))
			{
				System.out.println("Congratulations on your choice to adopt!");
				System.out.println("Enter the name of the giraffe you'd like to adopt");
				System.out.println();
				String giraffeName = input.next();
								
				System.out.println("You've adopted: " + giraffeName + "! Congratulations!");			
			}
			
			else if(choice.equalsIgnoreCase("Return"))
			{
				System.out.println("You've chosen to put a giraffe up for adoption.");
				System.out.println("What is the giraffe's name?");
				String giraffeName = input.next();
				System.out.println("Give us a brief description of your giraffe's personality.");
				String giraffePersonality = input.next();
				System.out.println();
				myVirtualPetShelter.returnPet(new Pets(giraffeName, giraffePersonality, 50, 50, 50));	
			}
			
			System.out.println("Our current adoptees are: ");
			myVirtualPetShelter.showPets();
		}
		while(!choice.equalsIgnoreCase("exit"));
		
		
	}

}
