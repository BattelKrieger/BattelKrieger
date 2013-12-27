package com.github.BattelKrieger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BankRaub extends JavaPlugin {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		// Umwandlung Sender -> Player
		Player p = null;
		if (sender instanceof Player) {
			p = (Player) sender;
		}

		// Kommando "test"
		if (cmd.getName().equalsIgnoreCase("Raub")) {

			if (p != null) {
				p.sendMessage(ChatColor.RED + "Hallo Räuber" + ChatColor.YELLOW
						+ p.getDisplayName());
				p.sendMessage(ChatColor.GREEN + "[Bankraub]" + ChatColor.BLUE
						+ "Der Raub beginnt gleich");
				return true;
			}

		}
		return false;
	}

}