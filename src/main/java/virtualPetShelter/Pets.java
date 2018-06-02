package virtualPetShelter;
import java.util.Random;

public class Pets 
{

	private String giraffeName;
	private String giraffePersonality;
	private int happiness;
	private int beauty;
	private int health;
	
	Random rand = new Random();


	public Pets(String giraffeName, int happiness, int beauty, int health, String giraffePersonality) 
	{
		this.giraffeName = giraffeName;
		this.giraffePersonality = giraffePersonality;
		this.happiness = happiness;
		this.beauty = beauty;
		this.health = health;
	}

	public String getGiraffeName() 
	{
		return giraffeName;
	}
	
	public String getGiraffePersonality()
	{
		return giraffePersonality + happiness + beauty + health;
	}

	public int getHappiness() 
	{
		return happiness;
	}
	
	public void feed(String food)
	{
			happiness += 15;
	}

	public void batheAll() 
	{
		beauty += 20;
	}

	public int getBeauty() 
	{
		return beauty;
	}

	public void checkupAll() 
	{
		health += 30;
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
