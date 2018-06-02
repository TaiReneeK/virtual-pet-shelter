package virtualPetShelter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter 
{
	Map<String, Pets> giraffes = new HashMap<>();

	public void adopt(Pets adoptees) 
	{
		giraffes.put(adoptees.getGiraffeName(), adoptees);
		giraffes.put(adoptees.getGiraffePersonality(), adoptees);
	}

	public Pets findPet(String giraffe) 
	{
		return giraffes.get(giraffe);
	}

	public Collection<Pets> getAllPets() 
	{
		return giraffes.values();
	}

	public void returnPet(Pets giraffe) 
	{
		giraffes.remove(giraffe.getGiraffeName());
	}

	public void getHappiness(String entry) 
	{
		
	}

	public void batheAll() 
	{
		for (Pets giraffes : giraffes.values())
		{
			giraffes.batheAll();
		}
	}

	public void checkupAll() 
	{
		for (Pets giraffes : giraffes.values())
		{
			giraffes.checkupAll();
		}
	}

	public void showPets() 
	{
		for(Pets giraffes : giraffes.values())
		{
			System.out.println("Giraffe Name: " + giraffes.getGiraffeName() + 
					" Personality & Stats: " + giraffes.getGiraffePersonality());
		}
	}



}
