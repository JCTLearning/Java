package me.specifies.Main;

public enum Errors
{
  PLAYER_ONLY_COMMAND,  NO_PERMISSIONS,  TOO_LESS_ARGUMENTS,  TOO_MANY_ARGUMENTS,  FILE_DOES_NOT_EXIST,  TOO_MANY_HOMES,  HOME_DOES_NOT_EXIST,  HOME_ALREADY_EXISTS,  ITEM_IN_HAND_IS_EMPTY,  PLAYER_DOES_NOT_EXIST,  PLAYER_IS_NOT_ONLINE,  VALUE_IS_NOT_NUMBER,  VALUE_DOES_NOT_EXIST,  FULL_INVENTORY,  COMMAND_IS_INVALID,  SIGN_LINE_INVALID,  PLAYER_ALREADY_MUTED,  PLAYER_NOT_MUTED,  PLAYER_MUTED;
  
  public static String getErrorMessage(Errors type)
  {
    String msg = "";
    if (type == PLAYER_ONLY_COMMAND) {
      msg = "Only players can use this command!";
    } else if (type == NO_PERMISSIONS) {
      msg = "You've got no permissions for this!";
    } else if (type == TOO_LESS_ARGUMENTS) {
      msg = "You've entered too less arguments!";
    } else if (type == TOO_MANY_ARGUMENTS) {
      msg = "You've entered too many arguments!";
    } else if (type == FILE_DOES_NOT_EXIST) {
      msg = "File does not exist!";
    } else if (type == TOO_MANY_HOMES) {
      msg = "You've reached the maximum homes!";
    } else if (type == HOME_DOES_NOT_EXIST) {
      msg = "You've entered an invalid home!";
    } else if (type == HOME_ALREADY_EXISTS) {
      msg = "You've entered an home that already exists!";
    } else if (type == ITEM_IN_HAND_IS_EMPTY) {
      msg = "The item in your hand is empty!";
    } else if (type == PLAYER_DOES_NOT_EXIST) {
      msg = "The entered player is invalid or is not online!";
    } else if (type == PLAYER_IS_NOT_ONLINE) {
      msg = "The entered player is not online!";
    } else if (type == VALUE_IS_NOT_NUMBER) {
      msg = "The entered value is not a valid number!";
    } else if (type == VALUE_DOES_NOT_EXIST) {
      msg = "The entered value does not exist!";
    } else if (type == FULL_INVENTORY) {
      msg = "The inventory is full!";
    } else if (type == COMMAND_IS_INVALID) {
      msg = "The entered command argument is invalid!";
    } else if (type == SIGN_LINE_INVALID) {
      msg = "One of the sign lines is invalid!";
    } else if (type == PLAYER_ALREADY_MUTED) {
      msg = "This player is already muted!";
    } else if (type == PLAYER_NOT_MUTED) {
      msg = "This player is already unmuted!";
    } else if (type == PLAYER_MUTED) {
      msg = "You are muted. You can't talk!";
    }
    return msg;
  }
}
