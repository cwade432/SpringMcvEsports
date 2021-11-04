package esports;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import esports.beans.EsportsTeam;
import esports.beans.Player;
import esports.controller.BeanConfiguration;
import esports.repository.PlayerRepository;

@SpringBootApplication
public class SpringMcvEsportsApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringMcvEsportsApplication.class, args);
	}

	/*@Autowired
	PlayerRepository repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// using existing bean
		Player c = appContext.getBean("player", Player.class);
		c.setUsername("Tenz");
		repo.save(c);
		
		// creating bean to use, not managed to Spring
		Player d = new Player("TheNardDog", 55, 22, 11);
		EsportsTeam a = new EsportsTeam("London Spitfire", 22, 5);
		d.setEsportsTeam(a);
		repo.save(d);
		
		List<Player> allMyPlayers = repo.findAll();
		
		for(Player people: allMyPlayers)
		{
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}*/
	
	

}
