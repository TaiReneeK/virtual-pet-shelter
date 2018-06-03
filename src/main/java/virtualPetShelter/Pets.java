package virtualPetShelter;
import java.util.Random;

public class Pets 
{

	private String giraffeName;
	private String personality;
	private int happiness;
	private int beauty;
	private int health;
	
	Random rand = new Random();


	public Pets(String giraffeName, String personality, int happiness, int beauty, int health) 
	{
		this.giraffeName = giraffeName;
		this.personality = personality;
		this.happiness = happiness;
		this.beauty = beauty;
		this.health = health;
	}

	public String getGiraffeName() 
	{
		return giraffeName;
	}
	
	public String getPersonality()
	{
		return personality + " " + happiness  + ", " + beauty + ", " + health + ".";
	}

	public int getHappiness() 
	{
		return happiness;
	}
	
	public void feedPets() 
	{
		if (happiness == 100) 
		{
			happiness += 0;
		} 
		
		else if (happiness < 10)
		{
			happiness += 15;
		}
	}

	public void batheAll() 
	{
		if(beauty == 100)
		{
			beauty += 0;
		}
		else if(beauty < 100)
		{
			beauty += 20;			
		}
		System.out.println("All of the giraffes are nice and clean!");
	}

	public int getBeauty() 
	{
		return beauty;
	}

	public void checkupAll() 
	{
		if(health == 100)
		{
			health += 0;
		}
		else if(health < 100)
		{
		health += 30;
		}
	}

	public int getHealth() 
	{
		return health;
	}
	
	public void tick() 
	{
		if(happiness < 70)
		{
			happiness -= rand.nextInt(5);
			health -= rand.nextInt(5);
		}
		
		else if(happiness >= 85)
		{
			beauty += rand.nextInt(10);
		}
		
		else if(beauty <= 70)
		{
			happiness -= rand.nextInt(5);
			health -= rand.nextInt(5);
		}
		
		else if(beauty >= 80)
		{
			health += rand.nextInt(10);
		}
		
		else if(health <= 80)
		{
			happiness -= rand.nextInt(5);
			beauty -= rand.nextInt(5);
		}
		
		else
		{
			happiness += rand.nextInt(10);
			beauty += rand.nextInt(10);
		}
	}

}
