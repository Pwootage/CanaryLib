package net.canarymod.commandsys.commands;

import net.canarymod.Canary;
import net.canarymod.ToolBox;
import net.canarymod.api.PlayerReference;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.position.Position;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.chat.TextFormat;
import net.canarymod.commandsys.NativeCommand;
import net.canarymod.user.Group;
import net.canarymod.warp.Warp;

/**
 * Command to view multiple types of info about a player (possible yourself)
 *
 * @author Jason (darkdiplomat)
 */
public class PlayerInformation implements NativeCommand {

    @Override
    public void execute(MessageReceiver caller, String[] args) {
        PlayerReference subject = null;
        if (args.length == 2) {
            subject = Canary.getServer().matchPlayer(args[1]);
            if (subject == null) {
                subject = Canary.getServer().getOfflinePlayer(args[1]);
            }
        }
        else if (caller instanceof Player) {
            subject = (Player) caller;
        }

        if (subject != null) {
            caller.message(TextFormat.GREEN + subject.getName() + "'s info:");
            sendData(caller, "First Joined: ", subject.getFirstJoined());
            sendData(caller, "Last Joined: ", subject.getLastJoined());
            sendData(caller, "Time Played: ", ToolBox.getTimeUntil(subject.getTimePlayed()));
            sendData(caller, "Muted: ", subject.isMuted());
            sendData(caller, "Prefix: ", subject.getPrefix());
            sendData(caller, "IP: ", subject.getIP());
            sendData(caller, "Primary Group: ", subject.getGroup().getName());
            sendData(caller, "Other Groups: ", subject.getPlayerGroups());
            sendData(caller, "Health: ", String.format("%.1f", subject.getHealth()));
            sendData(caller, "Mode: ", subject.getMode());
            sendData(caller, "Food Level: ", subject.getHunger());
            sendData(caller, "Food Exhaustion: ", String.format("%.2f", subject.getExhaustionLevel()));
            sendData(caller, "XP Level: ", subject.getLevel());
            sendData(caller, "XP Total: ", subject.getExperience());
            Position pos = subject.getPosition();

            sendData(caller, "Position: ", String.format("X: %.2f Y: %.2f Z: %.2f", pos.getX(), pos.getY(), pos.getZ()));
            sendData(caller, "World: ", subject.getWorld().getFqName());
            Warp home = Canary.warps().getHome(subject.getName());

            if (home != null) {
                pos = home.getLocation();
                sendData(caller, "Home: ", String.format("X: %.2f Y: %.2f Z: %.2f", pos.getX(), pos.getY(), pos.getZ()));
            }
            else {
                sendData(caller, "Home: ", "Not set");
            }
        }
        else {
            caller.notice("Can't find player " + args[1]);
        }
    }

    private void sendData(MessageReceiver caller, String caption, Group[] data) {
        StringBuilder gnames = new StringBuilder("");
        for (int index = 1; index < data.length; index++) {
            gnames.append(data[index].getName());
        }
        caller.message(TextFormat.LIGHT_GREEN + caption + TextFormat.ORANGE + gnames.toString());
    }

    private void sendData(MessageReceiver caller, String caption, Object data) {
        caller.message(TextFormat.LIGHT_GREEN + caption + TextFormat.ORANGE + String.valueOf(data));
    }

}
