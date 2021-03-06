//Copyright 2015 Ryan Hamshire

package me.ryanhamshire.AutomaticInventory;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

//sends a message to a player
//used to send delayed messages, for example help text triggered by a player's chat
class SendPlayerMessageTask implements Runnable {
	private final Player player;
	private final ChatColor color;
	private final String message;

	public SendPlayerMessageTask(Player player, ChatColor color, String message) {
		this.player = player;
		this.color = color;
		this.message = message;
	}

	@Override
	public void run() {
		if (player == null) {
			AutomaticInventory.AddLogEntry(color + message);
			return;
		}

		AutomaticInventory.sendMessage(this.player, this.color, this.message);
	}

}
