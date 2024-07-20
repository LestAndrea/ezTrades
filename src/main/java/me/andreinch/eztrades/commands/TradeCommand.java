package me.andreinch.eztrades.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Subcommand;
import co.aikar.commands.annotation.Syntax;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TradeCommand extends BaseCommand {

    @Default
    @CommandPermission(value = "exTrade.trade")
    @Syntax(value = "trade <player>")
    public static void onCommand(Player player, String[] args) {
        Player target = Bukkit.getPlayer(args[0]);

        if(target != null && target.isOnline()) {
            //TODO: Play sound and open gui to the players
        }
    }

}
