package net.canarymod.commandsys.commands;

import net.canarymod.Canary;
import net.canarymod.Translator;
import net.canarymod.api.OfflinePlayer;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.chat.Colors;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.NativeCommand;

/**
 * Command to unban a player
 *
 * @author Chris (damagefilter)
 */
public class UnbanCommand implements NativeCommand {

    public void execute(MessageReceiver caller, String[] cmd) {
        if (cmd.length < 2) {
            Canary.help().getHelp(caller, "unban");
            return;
        }
        Player p = Canary.getServer().getPlayer(cmd[1]);
        String uuid = null;
        if (p != null) {
            uuid = p.getUUIDString();
        }
        else {
            OfflinePlayer op = Canary.getServer().getOfflinePlayer(cmd[1]);
            if (op != null) {
                uuid = op.getUUIDString();
            }
        }
        if (uuid != null) {
            Canary.bans().unban(cmd[1]);
            caller.message(Colors.YELLOW + Translator.translateAndFormat("unban success", cmd[1]));
        }
        else {
            // TODO tell them something wasn't valid
        }
    }
}
