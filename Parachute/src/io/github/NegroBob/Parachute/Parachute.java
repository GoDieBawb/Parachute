package io.github.NegroBob.Parachute;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Squid;

public class Parachute extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
		
	}

	@EventHandler
	public void onLeash(PlayerLeashEntityEvent LeashEvent){
		
		Player player = LeashEvent.getPlayer();
		Entity leashed = LeashEvent.getEntity();
		getLogger().info(LeashEvent.getPlayer().getName() + " leashed!");
		
		if (leashed instanceof Chicken){
			player.sendMessage("I'm a chicken bro");
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 30, 30));
					
		if (leashed instanceof Squid) {
			player.sendMessage("I'm a squid bro");
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 30, 30));
			
				}
			}	
		}	
	}
