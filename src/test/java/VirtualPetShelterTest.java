import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.contains;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import virtualPetShelter.Pets;
import virtualPetShelter.VirtualPetShelter;

public class VirtualPetShelterTest 
{
	VirtualPetShelter underTest;
	Pets giraffe1;
	Pets giraffe2;
	Pets giraffe3;
	Pets giraffe4;
	
	@Before
	public void setUp()
	{
		underTest = new VirtualPetShelter();
		giraffe1 = new Pets("Masai", 50, 50, 50, "Straight out of Tanzania; He loves to eat Acacia leaves!");
		giraffe2 = new Pets("Rothschild", 50, 50, 50, "From Kenya; has anxiety and hates Acacia leaves but loves Mimosa leaves!");
		giraffe3 = new Pets("Nori", 50, 50, 50, "Abandoned in North Africa, she is extremely beautiful and loves Apricot leaves!");
		giraffe4 = new Pets("Kordo", 50, 50, 50, "Picked up in Cameroon, he is tough and stubborn but will eat anything!");
	}
	
	@Test
	public void shouldBeAbleToAdoptPet()
	{
		underTest.adopt(giraffe1);
		Pets adoptedPet = underTest.findPet("Masai");
		assertThat(adoptedPet, is(giraffe1));
	}
	
	@Test
	public void shouldBeAbleToAdoptTwoPets()
	{
		underTest.adopt(giraffe1);
		underTest.adopt(giraffe2);
		Collection<Pets> allPets = underTest.getAllPets();
		assertThat(allPets, contains(giraffe1, giraffe2));
		assertEquals(2, allPets.size());
	}
	
	@Test
	public void shouldBeAbleToReturnPet()
	{
		underTest.adopt(giraffe1);
		underTest.returnPet(giraffe1);
		Pets adoptedPet = underTest.findPet(giraffe1.getGiraffeName());
		assertThat(adoptedPet, is(nullValue()));
	}
	
	@Test
	public void shouldBeAbleToBatheAllPets()
	{
		underTest.adopt(giraffe1);
		underTest.adopt(giraffe2);
		underTest.batheAll();
		int check = giraffe1.getBeauty();
		assertEquals(70, check);
		int check2 = giraffe2.getBeauty();
		assertEquals(70, check2);
	}
	
	@Test
	public void shouldBeAbleToTakeAllPetsForACheckup()
	{
		underTest.adopt(giraffe1);
		underTest.adopt(giraffe2);
		underTest.checkupAll();
		int check = giraffe1.getHealth();
		assertEquals(80, check);
		int check2 = giraffe2.getHealth();
		assertEquals(80, check);
	}
}
