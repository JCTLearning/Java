package me.specifies.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import org.bukkit.OfflinePlayer;
import plugins.Panda.FEssentials.Main.Core;
import plugins.Panda.FEssentials.Main.Plugin;

public class BannedPlayers
{
  private OfflinePlayer player;
  private String uuid;
  
  public BannedPlayers(OfflinePlayer player)
  {
    checkFolders();
    
    this.player = player;
    this.uuid = this.player.getUniqueId().toString();
  }
  
  public void unban()
  {
    File file = new File(Plugin.core.getDataFolder(), "/tmp/b/" + this.uuid + ".yml");
    file.delete();
  }
  
  public boolean isBanned()
  {
    checkFolders();
    return new File(Plugin.core.getDataFolder(), "/tmp/b/" + this.uuid + ".yml").exists();
  }
  
  public boolean isBannedForever()
  {
    checkFolders();
    if (getTimeUnits() == -1) {
      return true;
    }
    return false;
  }
  
  public void setProperties(int timeUnits, String reason)
  {
    checkFolders();
    
    File file = new File(Plugin.core.getDataFolder(), "/tmp/b/" + this.uuid + ".yml");
    file.delete();
    try
    {
      file.createNewFile();
    }
    catch (IOException e1)
    {
      e1.printStackTrace();
    }
    try
    {
      FileWriter writer = new FileWriter(file);
      writer.write(this.uuid + ":" + timeUnits + ":" + reason);
      
      writer.flush();
      writer.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public String[] getProperties()
  {
    File file = new File(Plugin.core.getDataFolder(), "/tmp/b/" + this.uuid + ".yml");
    return readFile(file);
  }
  
  public int getTimeUnits()
  {
    return Integer.parseInt(getProperties()[1]);
  }
  
  public String getReason()
  {
    return getProperties()[2];
  }
  
  private String[] readFile(File file)
  {
    checkFolders();
    
    str = "";
    try
    {
      FileReader reader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(reader);
      try
      {
        String s;
        while ((s = bufferedReader.readLine()) != null)
        {
          String s;
          str = str + s.toString();
        }
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      try
      {
        bufferedReader.close();
        reader.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      return str.split(":");
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
  }
  
  private void checkFolders()
  {
    File f1 = new File(Plugin.core.getDataFolder(), "/tmp/");
    if (!f1.exists()) {
      f1.mkdir();
    }
    File f2 = new File(Plugin.core.getDataFolder(), "/tmp/b/");
    if (!f2.exists()) {
      f2.mkdir();
    }
  }
}
