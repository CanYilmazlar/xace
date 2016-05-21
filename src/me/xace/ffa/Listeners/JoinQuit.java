package me.xace.ffa.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.xace.ffa.Gruplar.Grup;

public class JoinQuit implements Listener{
	@EventHandler
	public void on(PlayerJoinEvent e){
		if(Grup.dev.contains(e.getPlayer())){
			Grup.setDev(e.getPlayer());
		}
		if(Grup.vip.contains(e.getPlayer())){
			Grup.setVip(e.getPlayer());
		}
	}
}
