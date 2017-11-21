package me.specifies.Listeners

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import plugins.Panda.FEssentials.Main.Core;
import plugins.Panda.FEssentials.Main.Plugin;

public class Afk
  implements Listener
{
  Core core;
  
  public Afk(Core core)
  {
    this.core = core;
  }
  
  @EventHandler
  public void onPlayerMove(PlayerMoveEvent event)
  {
    Player player = event.getPlayer();
    if ((((int)event.getFrom().getX() != (int)event.getTo().getX()) || ((int)event.getFrom().getY() != (int)event.getTo().getY()) || ((int)event.getFrom().getZ() != (int)event.getTo().getZ())) && 
      (Plugin.core.afk.contains(player)))
    {
      player.sendMessage(ChatColor.GRAY + ChatColor.ITALIC + "You are not AFK anymore.");
      Plugin.core.afk.remove(player);
    }
  }
}
