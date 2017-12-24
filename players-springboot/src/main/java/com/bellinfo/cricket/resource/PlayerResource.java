package com.bellinfo.cricket.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bellinfo.cricket.model.Player;
import com.bellinfo.cricket.model.Players;

@RestController
@RequestMapping(value = "/Player")
public class PlayerResource {

	@RequestMapping(value = "/all", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Players getPlayers() {
		
		return getAllPlayer();
	}
	
	@RequestMapping(value = "/store", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String storePlayers(@RequestBody Player player) {
		System.out.println(player);
		return "Playe stored successfully";
		
		
	}
		
	
	
	public Players getAllPlayer(){
		
		Players players = new Players();
		Player p1 = new Player();
		p1.setName("Virat Kohli");
		p1.setRole("Batsman");
		p1.setScore("50");
		
		Player p2 = new Player();
		p2.setName("Dhoni");
		p2.setRole("Wicket Keepr");
		p2.setScore("55");
		
		Player[] parr = new Player[2];
		
		parr[0]=p1;
		parr[1]=p2;
		
		players.setPlayer(parr);
		
		return players;
		
	}
}

