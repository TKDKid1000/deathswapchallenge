package io.github.tkdkid1000;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class StartDeathSwap implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
        	Player player1 = (Player) sender;
        	 Player player2 = Bukkit.getPlayer(args[0]);
        	 if (player2 != null) {
                 Location player1coords = player1.getLocation();
                 Location player2coords = player2.getLocation();
        	     player1.teleport(player2coords);
        	     player2.teleport(player1coords);        	                
        		return true;
        	 } else {
        		 player1.sendMessage("The requested player is offline.");
        	 }
        }
		return false;

           
        }
}