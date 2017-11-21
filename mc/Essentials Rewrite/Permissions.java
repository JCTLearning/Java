package me.specifies.Main;

public enum Permissions
{
  COMMAND_SETHOME,  COMMAND_HOME,  COMMAND_DELHOME,  COMMAND_HAT,  COMMAND_CLEAR,  COMMAND_CLEARINVENTORY,  COMMAND_CI,  COMMAND_SETSPAWN,  COMMAND_SPAWN,  COMMAND_HEAL,  COMMAND_FEED,  COMMAND_SUICIDE,  COMMAND_TP,  COMMAND_TPA,  COMMAND_TPACCEPT,  COMMAND_TELL,  COMMAND_CLEARCHAT,  COMMAND_BROADCAST,  COMMAND_EXP,  COMMAND_OP,  COMMAND_DEOP,  COMMAND_GAMEMODE,  COMMAND_GM,  COMMAND_GOD,  COMMAND_FLY,  COMMAND_GIVE,  COMMAND_I,  COMMAND_ITEM,  COMMAND_REPAIR,  COMMAND_COMPASS,  COMMAND_NEARBY,  COMMAND_NEAR,  COMMAND_WORKBENCH,  COMMAND_FURNACE,  COMMAND_TIME,  COMMAND_AFK,  COMMAND_SPEED,  COMMAND_NICK,  COMMAND_REALNAME,  COMMAND_WHOIS,  COMMAND_INVSEE,  COMMAND_WEATHER,  COMMAND_BAN,  COMMAND_TEMPBAN,  COMMAND_KICK,  COMMAND_KICKALL,  COMMAND_MUTE,  COMMAND_UNMUTE,  COMMAND_UNBAN,  COMMAND_PARDON,  SIGN_PLACE_DISPOSAL;
  
  public static String getPermission(Permissions type)
  {
    String permission = "";
    if (type == COMMAND_SETHOME) {
      permission = "essentials.sethome";
    } else if (type == COMMAND_HOME) {
      permission = "essentials.home";
    } else if (type == COMMAND_DELHOME) {
      permission = "essentials.delhome";
    } else if (type == COMMAND_HAT) {
      permission = "essentials.hat";
    } else if (type == COMMAND_CLEAR) {
      permission = "essentials.clear";
    } else if (type == COMMAND_CLEARINVENTORY) {
      permission = "essentials.clearinventory";
    } else if (type == COMMAND_CI) {
      permission = "essentials.ci";
    } else if (type == COMMAND_SETSPAWN) {
      permission = "essentials.setspawn";
    } else if (type == COMMAND_SPAWN) {
      permission = "essentials.spawn";
    } else if (type == COMMAND_HEAL) {
      permission = "essentials.heal";
    } else if (type == COMMAND_FEED) {
      permission = "essentials.feed";
    } else if (type == COMMAND_SUICIDE) {
      permission = "essentials.suicide";
    } else if (type == COMMAND_TP) {
      permission = "essentials.tp";
    } else if (type == COMMAND_TPA) {
      permission = "essentials.tpa";
    } else if (type == COMMAND_TPACCEPT) {
      permission = "essentials.tpaccept";
    } else if (type == COMMAND_TELL) {
      permission = "essentials.tell";
    } else if (type == COMMAND_CLEARCHAT) {
      permission = "essentials.clearchat";
    } else if (type == COMMAND_BROADCAST) {
      permission = "essentials.broadcast";
    } else if (type == COMMAND_EXP) {
      permission = "essentials.exp";
    } else if (type == COMMAND_OP) {
      permission = "essentials.op";
    } else if (type == COMMAND_DEOP) {
      permission = "essentials.op";
    } else if (type == COMMAND_GAMEMODE) {
      permission = "essentials.gamemode";
    } else if (type == COMMAND_GM) {
      permission = "essentials.gm";
    } else if (type == COMMAND_GOD) {
      permission = "essentials.god";
    } else if (type == COMMAND_FLY) {
      permission = "essentials.fly";
    } else if (type == COMMAND_GIVE) {
      permission = "essentials.give";
    } else if (type == COMMAND_I) {
      permission = "essentials.i";
    } else if (type == COMMAND_ITEM) {
      permission = "essentials.item";
    } else if (type == COMMAND_REPAIR) {
      permission = "essentials.repair";
    } else if (type == COMMAND_COMPASS) {
      permission = "essentials.compass";
    } else if (type == COMMAND_NEARBY) {
      permission = "essentials.nearby";
    } else if (type == COMMAND_NEAR) {
      permission = "essentials.near";
    } else if (type == COMMAND_WORKBENCH) {
      permission = "essentials.workbench";
    } else if (type == COMMAND_FURNACE) {
      permission = "essentials.furnace";
    } else if (type == COMMAND_TIME) {
      permission = "essentials.time";
    } else if (type == COMMAND_AFK) {
      permission = "essentials.afk";
    } else if (type == COMMAND_SPEED) {
      permission = "essentials.speed";
    } else if (type == COMMAND_NICK) {
      permission = "essentials.nick";
    } else if (type == COMMAND_REALNAME) {
      permission = "essentials.realname";
    } else if (type == COMMAND_WHOIS) {
      permission = "essentials.whois";
    } else if (type == COMMAND_INVSEE) {
      permission = "essentials.invsee";
    } else if (type == COMMAND_WEATHER) {
      permission = "essentials.weather";
    } else if (type == COMMAND_BAN) {
      permission = "essentials.ban";
    } else if (type == COMMAND_TEMPBAN) {
      permission = "essentials.tempban";
    } else if (type == COMMAND_KICK) {
      permission = "essentials.kick";
    } else if (type == COMMAND_KICKALL) {
      permission = "essentials.kickall";
    } else if (type == COMMAND_MUTE) {
      permission = "essentials.mute";
    } else if (type == COMMAND_UNMUTE) {
      permission = "essentials.unmute";
    } else if (type == COMMAND_UNBAN) {
      permission = "essentials.unban";
    } else if (type == COMMAND_PARDON) {
      permission = "essentials.pardon";
    }
    if (type == SIGN_PLACE_DISPOSAL) {
      permission = "essentials.sign.place.disposal";
    }
    return permission;
  }
}
