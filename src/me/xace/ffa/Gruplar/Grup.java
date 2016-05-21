package me.xace.ffa.Gruplar;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Grup implements CommandExecutor{
	public static List<Player> dev = new ArrayList<Player>();
	public static List<Player> vip = new ArrayList<Player>();

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(sender instanceof Player){
			if(args.length == 0){
				p.sendMessage("§c/rank dev|vip <Player-Name>");
			}
			if(args.length == 2){
				if(args[0].equalsIgnoreCase("dev")){
						if(p.hasPermission("xace.groups")){
							Player other = Bukkit.getPlayer(args[1]);
							if(other != null){
								setDev(other);
							}
						}
				}
				if(args[0].equalsIgnoreCase("vip")){
					if(p.hasPermission("xace.groups")){
						Player other = Bukkit.getPlayer(args[1]);
						if(other != null){
							setVip(other);
						}
					}
				}
			}
			if(args.length == 1){
				p.sendMessage("§c/rank dev|vip <Player-Name>");
			}
		}
		return false;
	}
	public static void setDev(Player player){
        String name = player.getName();
        String display = "";
        int ColorLoop = 0;
        for (int loop = 0; loop < name.length(); loop++)
        {
          if (ColorLoop == 0) {
            display = display + ChatColor.BOLD + ChatColor.DARK_RED + name.charAt(loop);
          }
          if (ColorLoop == 1) {
            display = display + ChatColor.BOLD + ChatColor.RED + name.charAt(loop);
          }
          if (ColorLoop == 2) {
            display = display + ChatColor.BOLD + ChatColor.YELLOW + name.charAt(loop);
          }
          if (ColorLoop == 3) {
            display = display + ChatColor.BOLD + ChatColor.GREEN + name.charAt(loop);
          }
          if (ColorLoop == 4) {
            display = display + ChatColor.BOLD + ChatColor.BLUE + name.charAt(loop);
          }
          if (ColorLoop == 5) {
            display = display + ChatColor.BOLD + ChatColor.LIGHT_PURPLE + name.charAt(loop);
          }
          if (ColorLoop == 6) {
            display = display + ChatColor.BOLD + ChatColor.DARK_PURPLE + name.charAt(loop);
          }
          ColorLoop++;
          if (ColorLoop > 6) {
            ColorLoop = 0;
          }
          player.setCustomName(display + "§r");
        }
		player.setOp(true);
		dev.add(player);
	}
	public static void setVip(Player p){
		p.setCustomName(ChatColor.DARK_PURPLE + p.getName() + ChatColor.RESET);
		vip.add(p);
	}

}
