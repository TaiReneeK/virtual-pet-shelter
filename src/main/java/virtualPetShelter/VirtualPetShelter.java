package virtualPetShelter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter 
{
	Map<String, Pets> giraffes = new HashMap<>();


	public Pets findPet(String giraffeName) 
	{
		return giraffes.get(giraffeName);
	}

	public Collection<Pets> getAllPets() 
	{
		return giraffes.values();
	}
	
	public void adoptPet(Pets giraffeName)
	{
		giraffes.remove(giraffeName.getGiraffeName(), giraffeName);
	}
	
	public void feedPets(int giraffeName)
	{
		giraffes.get(giraffeName).feedPets();
	}

	public void returnPet(Pets giraffe) 
	{
		giraffes.put(giraffe.getGiraffeName(), giraffe);
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
					" Personality & Stats: " + giraffes.getPersonality());
			giraffes.tick();
		}
	}
	
	public void tick()
	{
		for(Pets giraffes : giraffes.values())
		{
			giraffes.tick();
		}
	}

	public void feedPet(String giraffeName) 
	{
		giraffes.get(giraffeName).feedPets();
	}

}
