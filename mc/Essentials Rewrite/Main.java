package me.specifies.Main;
/*
*
*
* All of the Java packages will be using "specifies" as a package attri. Two other Programmers that deserve credit are:
* Tre, UndercoverPanda
* If there are any methods that use "plugins.panda" they will be rewritten to "me.specifies" at the end of the rewrite.
*/
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import plugins.Panda.FEssentials.BannedPlayers;
import plugins.Panda.FEssentials.Commands.Chat.Broadcast;
import plugins.Panda.FEssentials.Commands.Chat.Clearchat;
import plugins.Panda.FEssentials.Commands.Chat.Tell;
import plugins.Panda.FEssentials.Commands.Health.Feed;
import plugins.Panda.FEssentials.Commands.Health.God;
import plugins.Panda.FEssentials.Commands.Health.Suicide;
import plugins.Panda.FEssentials.Commands.Home.Delhome;
import plugins.Panda.FEssentials.Commands.Home.Home;
import plugins.Panda.FEssentials.Commands.Home.Sethome;
import plugins.Panda.FEssentials.Commands.Inventory.Clear;
import plugins.Panda.FEssentials.Commands.Inventory.Furnace;
import plugins.Panda.FEssentials.Commands.Inventory.Give;
import plugins.Panda.FEssentials.Commands.Inventory.Hat;
import plugins.Panda.FEssentials.Commands.Inventory.Invsee;
import plugins.Panda.FEssentials.Commands.Inventory.Repair;
import plugins.Panda.FEssentials.Commands.Inventory.Workbench;
import plugins.Panda.FEssentials.Commands.Player.AFK;
import plugins.Panda.FEssentials.Commands.Player.Compass;
import plugins.Panda.FEssentials.Commands.Player.Deop;
import plugins.Panda.FEssentials.Commands.Player.Exp;
import plugins.Panda.FEssentials.Commands.Player.Fly;
import plugins.Panda.FEssentials.Commands.Player.Gamemode;
import plugins.Panda.FEssentials.Commands.Player.Nearby;
import plugins.Panda.FEssentials.Commands.Player.Nick;
import plugins.Panda.FEssentials.Commands.Player.Op;
import plugins.Panda.FEssentials.Commands.Player.Realname;
import plugins.Panda.FEssentials.Commands.Player.Speed;
import plugins.Panda.FEssentials.Commands.Player.Whois;
import plugins.Panda.FEssentials.Commands.Punishments.Kick;
import plugins.Panda.FEssentials.Commands.Punishments.Unban;
import plugins.Panda.FEssentials.Commands.Punishments.Unmute;
import plugins.Panda.FEssentials.Commands.Spawn.Setspawn;
import plugins.Panda.FEssentials.Commands.Spawn.Spawn;
import plugins.Panda.FEssentials.Commands.Teleport.Tp;
import plugins.Panda.FEssentials.Commands.Teleport.Tpa;
import plugins.Panda.FEssentials.Commands.Teleport.Tpaccept;
import plugins.Panda.FEssentials.Commands.World.Time;
import plugins.Panda.FEssentials.Commands.World.Weather;
import plugins.Panda.FEssentials.Listeners.PlayerMove.Afk;

public class Main extends JavaPlugin {
  public ArrayList<Player> afk = new ArrayList();
  private PunishmentHandler punishmentHandler;
  
  public void onEnable() {
    Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + ChatColor.STRIKETHROUGH + "----------------------------------------------------------------");
    Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "                      Enabling FEssentials...");
    Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + ChatColor.STRIKETHROUGH + "----------------------------------------------------------------");
    
    new Plugin(this);
    this.punishmentHandler = new PunishmentHandler();
    
    getCommand("Broadcast").setExecutor(new Broadcast());
    getCommand("Clearchat").setExecutor(new Clearchat());
    getCommand("Tell").setExecutor(new Tell());
    
    getCommand("Feed").setExecutor(new Feed());
    getCommand("God").setExecutor(new God());
    getCommand("Heal").setExecutor(new plugins.Panda.FEssentials.Commands.Health.Heal());
    getCommand("Suicide").setExecutor(new Suicide());
    
    getCommand("Sethome").setExecutor(new Sethome());
    getCommand("Delhome").setExecutor(new Delhome());
    getCommand("Home").setExecutor(new Home());
    
    getCommand("Clear").setExecutor(new Clear());
    getCommand("Clearinventory").setExecutor(new Clear());
    getCommand("Ci").setExecutor(new Clear());
    getCommand("Furnace").setExecutor(new Furnace());
    getCommand("Give").setExecutor(new Give());
    getCommand("I").setExecutor(new Give());
    getCommand("Item").setExecutor(new Give());
    getCommand("Hat").setExecutor(new Hat());
    getCommand("Invsee").setExecutor(new Invsee());
    getCommand("Repair").setExecutor(new Repair());
    getCommand("Workbench").setExecutor(new Workbench());
    
    getCommand("Afk").setExecutor(new AFK());
    getCommand("Compass").setExecutor(new Compass());
    getCommand("Deop").setExecutor(new Deop());
    getCommand("Exp").setExecutor(new Exp());
    getCommand("Fly").setExecutor(new Fly());
    getCommand("Gamemode").setExecutor(new Gamemode());
    getCommand("Gm").setExecutor(new Gamemode());
    getCommand("Nearby").setExecutor(new Nearby());
    getCommand("Near").setExecutor(new Nearby());
    getCommand("Nick").setExecutor(new Nick());
    getCommand("Op").setExecutor(new Op());
    getCommand("Realname").setExecutor(new Realname());
    getCommand("Speed").setExecutor(new Speed());
    getCommand("Whois").setExecutor(new Whois());
    
    getCommand("Ban").setExecutor(new plugins.Panda.FEssentials.Commands.Punishments.Ban());
    getCommand("Kick").setExecutor(new Kick());
    getCommand("Mute").setExecutor(new plugins.Panda.FEssentials.Commands.Punishments.Mute());
    getCommand("Unmute").setExecutor(new Unmute());
    getCommand("Unban").setExecutor(new Unban());
    
    getCommand("Tp").setExecutor(new Tp());
    getCommand("Tpa").setExecutor(new Tpa());
    getCommand("Tpaccept").setExecutor(new Tpaccept());
    
    getCommand("Setspawn").setExecutor(new Setspawn());
    getCommand("Spawn").setExecutor(new Spawn());
    
    getCommand("Time").setExecutor(new Time());
    getCommand("Weather").setExecutor(new Weather());
    
    PluginManager pm = Bukkit.getServer().getPluginManager();
    
    pm.registerEvents(new plugins.Panda.FEssentials.Listeners.ChatAsync.Mute(this), this);
    
    pm.registerEvents(new Afk(this), this);
    
    pm.registerEvents(new plugins.Panda.FEssentials.Listeners.PlayerPreLogin.Ban(this), this);
    
    pm.registerEvents(new plugins.Panda.FEssentials.Listeners.SignChange.Disposal(this), this);
    pm.registerEvents(new plugins.Panda.FEssentials.Listeners.SignChange.Free(this), this);
    pm.registerEvents(new plugins.Panda.FEssentials.Listeners.SignChange.Heal(this), this);
    
    pm.registerEvents(new plugins.Panda.FEssentials.Listeners.SignInteract.Disposal(this), this);
    pm.registerEvents(new plugins.Panda.FEssentials.Listeners.SignInteract.Free(this), this);
    pm.registerEvents(new plugins.Panda.FEssentials.Listeners.SignInteract.Heal(this), this);
    
    PunishmentHandler.unloadTempFile();
    
    Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
      public void run()
      {
        OfflinePlayer[] arrayOfOfflinePlayer;
        int j = (arrayOfOfflinePlayer = Bukkit.getOfflinePlayers()).length;
        for (int i = 0; i < j; i++)
        {
          OfflinePlayer player = arrayOfOfflinePlayer[i];
          BannedPlayers bannedPlayer = new BannedPlayers(player);
          if ((bannedPlayer.isBanned()) && (!bannedPlayer.isBannedForever()))
          {
            bannedPlayer.setProperties(bannedPlayer.getTimeUnits() - 1, bannedPlayer.getReason());
            if (bannedPlayer.getTimeUnits() == 0) {
              bannedPlayer.unban();
            }
          }
        }
      }
    }, 20L, 20L);
    
    Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + ChatColor.STRIKETHROUGH + "----------------------------------------------------------------");
    Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "                      FEssentials enabled!");
    Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + ChatColor.STRIKETHROUGH + "----------------------------------------------------------------");
  }
  
  public void onDisable() {}
  
  public PunishmentHandler getPunishmentHandler() {
    return this.punishmentHandler;
  }
  
  public static boolean isInt(String str) {
    try {
      Integer.parseInt(str);
    }
    catch (NumberFormatException e) {
      return false;
    }
    return true;
  }
  
  public static boolean hasFullInventory(Player player) {
    ItemStack[] arrayOfItemStack;
    int j = (arrayOfItemStack = player.getInventory().getContents()).length;
    for (int i = 0; i < j; i++)
    {
      ItemStack is = arrayOfItemStack[i];
      if ((is == null) || (is.getType() == Material.AIR)) {
        return false;
      }
    }
    return true;
  }
}
