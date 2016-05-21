package me.xace.ffa.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;


public class SB implements Listener {
	String p = "§3Xace";
	
	@EventHandler
	public void PlayerJoin(PlayerJoinEvent e) {
		for(Player all : Bukkit.getOnlinePlayers()){
			setupBoard(all);
		}
	}
	@EventHandler
	public void PlayerQuit(PlayerQuitEvent e){
		for(Player all : Bukkit.getOnlinePlayers()){
			setupBoard(all);
		}
	}
	public void setupBoard(Player p){
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		
		Objective obj = board.registerNewObjective("ffa", "dummy");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName("§7§m---- " + p + " §7§m----");
		
		Score s1 = obj.getScore("            ");
		s1.setScore(2);
		
		Score score = obj.getScore("§8» §eName");
		score.setScore(1);
		
		Score name = obj.getScore(p.getDisplayName());
		name.setScore(0);
		
		
		p.setScoreboard(board);
	}
}
