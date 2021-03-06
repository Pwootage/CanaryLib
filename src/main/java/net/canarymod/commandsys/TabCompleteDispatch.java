package net.canarymod.commandsys;

import net.canarymod.chat.MessageReceiver;

import java.util.List;

/**
 * {@link net.canarymod.commandsys.TabComplete} method wrapper
 *
 * @author Jason (darkdiplomat)
 */
abstract class TabCompleteDispatch {
    abstract List<String> complete(MessageReceiver msgrec, String[] args) throws TabCompleteException;
}
