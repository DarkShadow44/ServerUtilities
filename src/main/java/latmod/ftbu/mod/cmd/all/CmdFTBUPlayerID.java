package latmod.ftbu.mod.cmd.all;

import latmod.ftbu.core.LMPlayer;
import latmod.ftbu.core.cmd.*;
import net.minecraft.command.ICommandSender;

public class CmdFTBUPlayerID extends SubCommand
{
	public NameType getUsername(String[] args, int i)
	{
		if(i == 0) return NameType.OFF;
		return NameType.NONE;
	}
	
	public String onCommand(ICommandSender ics, String[] args)
	{
		LMPlayer p = LMPlayer.getPlayer(args.length > 0 ? args[0] : ics);
		return CommandLM.FINE + "PlayerID for " + p.getName() + ": " + p.playerID;
	}
}