package me.specifies.Listeners

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import plugins.Panda.FEssentials.Main.Core;
import plugins.Panda.FEssentials.Main.Errors;
import plugins.Panda.FEssentials.Main.PunishmentHandler;

public class Mute
  implements Listener
{
  Core core;
  
  public Mute(Core core)
  {
    this.core = core;
  }
  
  @EventHandler
  public void onAsyncPlayerChat(AsyncPlayerChatEvent event)
  {
    Player player = event.getPlayer();
    if (this.core.getPunishmentHandler().isMuted(player))
    {
      player.sendMessage(ChatColor.RED + Errors.getErrorMessage(Errors.PLAYER_MUTED));
      event.setCancelled(true);
    }
  }
}
