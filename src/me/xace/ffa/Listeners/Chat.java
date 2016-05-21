package me.xace.ffa.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat implements Listener{
	@EventHandler
	public void on(AsyncPlayerChatEvent e){
		e.setCancelled(true);
		for (Player all : Bukkit.getOnlinePlayers()){
			all.sendMessage(e.getPlayer().getCustomName() + " §8" + e.getMessage());
		}
	}
}
