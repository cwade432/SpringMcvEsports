/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Oct 31, 2021
 */
package esports.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Player {
	
	@Id
	@GeneratedValue
	private long id;
	private String username;
	private int kills;
	private int deaths;
	private int assits;
	@Autowired
	private EsportsTeam esportsTeam;
	
	public Player()
	{
		super();
		this.username = "iPatchez";
	}
	
	public Player(String username)
	{
		super();
		this.username = username;
	}
	
	public Player(String username, int kills, int deaths, int assits)
	{
		super();
		this.username = username;
		this.kills = kills;
		this.deaths = deaths;
		this.assits = assits;
	}
	
	public Player(int id, String username, int kills, int deaths, int assits)
	{
		this.id = id;
		this.username = username;
		this.kills = kills;
		this.deaths = deaths;
		this.assits = assits;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * @param kills the kills to set
	 */
	public void setKills(int kills) {
		this.kills = kills;
	}

	/**
	 * @return the deaths
	 */
	public int getDeaths() {
		return deaths;
	}

	/**
	 * @param deaths the deaths to set
	 */
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	/**
	 * @return the assits
	 */
	public int getAssits() {
		return assits;
	}

	/**
	 * @param assits the assits to set
	 */
	public void setAssits(int assits) {
		this.assits = assits;
	}
	
	/**
	 * @return the esportsTeam
	 */
	public EsportsTeam getEsportsTeam() {
		return esportsTeam;
	}

	/**
	 * @param esportsTeam the esportsTeam to set
	 */
	public void setEsportsTeam(EsportsTeam esportsTeam) {
		this.esportsTeam = esportsTeam;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", username=" + username + ", kills=" + kills + ", deaths=" + deaths + ", assits="
				+ assits + ", esportsTeam=" + esportsTeam + "]";
	}
}
