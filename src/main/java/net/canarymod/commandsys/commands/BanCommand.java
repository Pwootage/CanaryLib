package net.canarymod.commandsys.commands;

import net.canarymod.Canary;
import net.canarymod.ToolBox;
import net.canarymod.Translator;
import net.canarymod.api.PlayerReference;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.bansystem.Ban;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.NativeCommand;
import net.canarymod.hook.player.BanHook;
import net.visualillusionsent.utils.StringUtils;

/**
 * Command to ban players by name
 *
 * @author Chris (damagefilter)
 * @author Jason (darkdiplomat)
 */
public class BanCommand implements NativeCommand {

    public void execute(MessageReceiver caller, String[] parameters) {
        if (parameters.length < 2) {
            Canary.help().getHelp(caller, "ban");
            return;
        }
        Ban ban = new Ban();
        PlayerReference ref = Canary.getServer().matchKnownPlayer(parameters[1]);
        String reason = "Permanently Banned";
        long timestamp = -1L;

        if (parameters.length >= 3) {
            try {
                timestamp = ToolBox.parseTime(Long.parseLong(parameters[parameters.length - 2]), parameters[parameters.length - 1]);
                reason = StringUtils.joinString(parameters, " ", 2, parameters.length - 2);
            }
            catch (NumberFormatException e) {
                reason = StringUtils.joinString(parameters, " ", 2);
                timestamp = -1L;
            }
        }
        ban.setReason(reason);
        ban.setTimestamp(timestamp);
        ban.setBanningPlayer(caller.getName());
        if (ref != null) {
            ban.setSubject(ref.getName());
            Canary.bans().issueBan(ban);
            Canary.hooks().callHook(new BanHook(ref, ref.getIP(), caller, reason, timestamp));
            caller.notice(Translator.translateAndFormat("ban banned", ref.getName()));
            if (ref.isOnline() && ref instanceof Player) {
                ((Player) ref).kick(reason);
            }
        }
        else {
            caller.notice(Translator.translate("ban failed") + " " + Translator.translateAndFormat("unknown player", parameters[1]));
        }
    }
}
