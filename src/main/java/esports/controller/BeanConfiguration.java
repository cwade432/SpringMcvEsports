/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Oct 31, 2021
 */
package esports.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import esports.beans.EsportsTeam;
import esports.beans.Player;

@Configuration
public class BeanConfiguration {

	@Bean
	public Player player()
	{
		Player bean = new Player("Doublelift");
		//bean.setUsername("tycoon432");
		//bean.setKills(25);
		//bean.setDeaths(12);
		//bean.setAssits(45);
		return bean;
	}
	
	@Bean
	public EsportsTeam esportsTeam()
	{
		EsportsTeam bean = new EsportsTeam("Cloud 9", 17, 1);
		return bean;
	}
	
}
