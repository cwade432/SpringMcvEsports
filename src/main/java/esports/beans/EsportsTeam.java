/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Oct 31, 2021
 */
package esports.beans;

import javax.persistence.Embeddable;

@Embeddable
public class EsportsTeam {

	private String teamName;
	private int wins;
	private int losses;
	
	public EsportsTeam()
	{
		super();
	}
	
	public EsportsTeam(String teamName, int wins, int losses)
	{
		super();
		this.teamName = teamName;
		this.wins = wins;
		this.losses = losses;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}

	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	@Override
	public String toString() {
		return "EsportsTeam [teamName=" + teamName + ", wins=" + wins + ", losses=" + losses + "]";
	}	
}
