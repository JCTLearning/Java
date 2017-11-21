package me.specifies.Main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import plugins.Panda.FEssentials.BannedPlayers;

public class PunishmentHandler
{
  private static ArrayList<Player> muted = new ArrayList();
  private static HashMap<OfflinePlayer, BannedPlayers> banned = new HashMap();
  
  public PunishmentHandler()
  {
    muted = new ArrayList();
  }
  
  public void setMuted(Player player, boolean muted)
  {
    if (muted) {
      muted.add(player);
    } else {
      muted.remove(player);
    }
  }
  
  public void setBanned(OfflinePlayer player, int timeUnits, String reason)
  {
    String timeLeft = Plugin.core.getPunishmentHandler().timeFormatFromUnits(timeUnits);
    if (timeUnits == -1) {
      timeLeft = ChatColor.DARK_RED + ChatColor.BOLD + "Forever";
    }
    if (player.isOnline()) {
      ((Player)player).kickPlayer(ChatColor.DARK_RED + "You have been banned!\n" + 
        ChatColor.RED + "Reason: " + ChatColor.translateAlternateColorCodes('&', reason) + "\n" + 
        ChatColor.RED + "Time left: " + timeLeft);
    }
    BannedPlayers bannedPlayer = new BannedPlayers(player);
    bannedPlayer.setProperties(timeUnits, reason);
  }
  
  public boolean isMuted(Player player)
  {
    try
    {
      return muted.contains(player);
    }
    catch (NullPointerException e) {}
    return false;
  }
  
  public static void loadTempFile()
  {
    File file = new File(Plugin.core.getDataFolder(), "/tmp/a.yml");
    YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
    try
    {
      file.createNewFile();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    config.set("list.muted", muted);
    config.set("list.banned", banned);
    try
    {
      config.save(file);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public static void unloadTempFile()
  {
    File file = new File(Plugin.core.getDataFolder(), "/tmp/a.yml");
    YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
    
    muted = (ArrayList)config.get("list.muted");
    banned = (HashMap)config.get("list.banned");
    
    file.delete();
  }
  
  public int timeFormatToUnits(String str)
  {
    int units = 0;
    
    String[] splittedTime = str.split(":");
    for (int i = 0; i < splittedTime.length; i++)
    {
      char inputCharacter = splittedTime[i].charAt(splittedTime[i].length() - 1);
      
      int inputTime = 0;
      if (Core.isInt(splittedTime[i].replace(Character.toString(inputCharacter), ""))) {
        inputTime = Integer.parseInt(splittedTime[i].replace(Character.toString(inputCharacter), ""));
      } else {
        return 0;
      }
      if (inputCharacter == 's') {
        units += inputTime;
      } else if (inputCharacter == 'm') {
        units += inputTime * 60;
      } else if (inputCharacter == 'h') {
        units += inputTime * 60 * 60;
      } else if (inputCharacter == 'd') {
        units += inputTime * 60 * 24;
      } else if (inputCharacter == 'y') {
        units += inputTime * 60 * 365;
      }
    }
    return units;
  }
  
  public String timeFormatFromUnits(int units)
  {
    int s = 0;int m = 0;int h = 0;int d = 0;int y = 0;
    for (int i = 0; i < units; i++)
    {
      if (units % 60 == 0)
      {
        m++;
        units -= 60;
      }
      if (m % 60 == 0) {
        h++;
      }
      if (h % 24 == 0) {
        d++;
      }
      if (d % 365 == 0) {
        y++;
      }
    }
    return y + " year(s), " + d + " day(s), " + h + " hour(s), " + m + " minute(s), " + s + " second(s)";
  }
}
