/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Oct 31, 2021
 */
package esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import esports.beans.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{ 
	
}
