package virtualPetShelter;
import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

		Pets Masai = new Pets("Masai: ", 85, 60, 70, 
				"Straight out of Tanzania; He loves to eat Acacia leaves!");
		Pets Rothschild = new Pets("Rothschild: ", 45, 60, 80,
				"From Kenya; has anxiety and hates Acacia leaves but loves Mimosa leaves!");
		Pets Nori = new Pets("Nori: ", 50, 90, 80,
				"Abandoned in North Africa, she is extremely beautiful and loves Apricot leaves!");
		Pets Kordo = new Pets("Kordo: ", 50, 70, 40,
				"Picked up in Cameroon, he is tough and stubborn but will eat anything!");

		myVirtualPetShelter.adopt(Masai);
		myVirtualPetShelter.adopt(Rothschild);
		myVirtualPetShelter.adopt(Nori);
		myVirtualPetShelter.adopt(Kordo);
		
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
			System.out.println("Type \"Return\" to give back you adopted pet");
			System.out.println("Type \"Exit\" to neglect the giraffes");
			choice = input.next();
			
			if (choice.equalsIgnoreCase("Happiness"))
			{
				System.out.println("Which pet would you like to feed: Masai, Rothschild, Nori, or Kordo?");
				System.out.println("Type \"Help\" to be reminded of what each giraffe likes to eat");
				String giraffeName = input.next();
				
				if(giraffeName.equalsIgnoreCase("Masai"))
				{
					
				}
			}
			
			else if(choice.equalsIgnoreCase("Beauty"))
			{
				for (Pets current : myVirtualPetShelter.getAllPets())
				{
					current.batheAll();
					System.out.println("You've bathed the giraffes!");
				}
			}
			
			else if(choice.equalsIgnoreCase("Health"))
			{
				for (Pets current : myVirtualPetShelter.getAllPets())
				{
					current.checkupAll();
					System.out.println("The giraffes are healthier now that they've been to the vet!");
				}
			}
			
			else if(choice.equalsIgnoreCase("Adopt"))
			{
				System.out.println("Congratulations on your choice to adopt!");
				System.out.println("Which giraffe would you like?");
				System.out.println();
			
				for(Pets current : myVirtualPetShelter.getAllPets())
				{

				}
				
				String giraffe = input.next();
				
				System.out.println("You've adopted: " + giraffe + "! Congratulations!");			
			}
			
			else if(choice.equalsIgnoreCase("Return"))
			{
				System.out.println("You've chosen to put a giraffe up for adoption.");
				System.out.println("What is the giraffe's name?");
				String giraffeName = input.next();
				System.out.println();
				System.out.println("Give us a brief description of your giraffe's personality.");
				String giraffePersonality = input.next();
								
			}
			
		}
		while(!choice.equalsIgnoreCase("exit"));
		
		
	}

}
