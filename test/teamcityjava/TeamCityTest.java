package teamcityjava;

import junit.framework.Assert;

import org.junit.Test;

import team.city.java.TeamCity;

public class TeamCityTest {

	@Test
	public void testSum() {
		TeamCity tc = new TeamCity();
		int result = tc.sumNumbers(5, 5);
		Assert.assertEquals("Calculo errado!", 3000, result);
	}

}
