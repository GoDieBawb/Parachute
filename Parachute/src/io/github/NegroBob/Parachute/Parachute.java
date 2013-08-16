package io.github.NegroBob.Parachute;

import java.util.Vector;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Parachute extends JavaPlugin implements Listener {
	
	public void onenable(){
		getServer().getPluginManager().registerEvents(this, this);
		
	}

	public void ondisable(){
		
	}
	@EventHandler
	public void onLeash(PlayerLeashEntityEvent LeashEvent){
		getLogger().info(LeashEvent.getPlayer().getName() + " leashed!");
		
		Player player = LeashEvent.getPlayer();
		Entity leashed = LeashEvent.getEntity();
		
		if (leashed instanceof Chicken){
			
			player.sendMessage("I'm a chicen bro");
					
				}else{
					player.sendMessage("I'm not a chicken bro");
			}	
		}	
	}
