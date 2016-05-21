package me.xace.ffa;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.xace.ffa.Gruplar.Grup;
import me.xace.ffa.Listeners.Chat;
import me.xace.ffa.Listeners.JoinQuit;
import me.xace.ffa.Listeners.SB;

public class Main extends JavaPlugin{
	public void onEnable(){
	registerEvents();
	registerCommands();
	}
	public void registerEvents(){
		Bukkit.getServer().getPluginManager().registerEvents(new SB(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Chat(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new JoinQuit(), this);
		}
	public void registerCommands(){
		Bukkit.getPluginCommand("rank").setExecutor(new Grup());
	}
}
