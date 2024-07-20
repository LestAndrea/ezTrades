package me.andreinch.eztrades.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class TradeAdminCommand extends BaseCommand {

    @Default
    @CommandPermission(value = "exTrades.admin")
    @CommandAlias(value = "ta")
    public static void onCommand(Player player, String[] args) {
        //TODO: Open Gui

        Inventory inv = Bukkit.createInventory(null, 27, "Admin Gui");

        ItemStack manageItems = new ItemStack(Material.CHEST);
        ItemMeta manageItemsMeta = manageItems.getItemMeta();
        manageItemsMeta.setDisplayName("Manage Items");
        List<String> lore1 = new ArrayList<>();
        lore1.add("Allow/Deny Items");
        manageItemsMeta.setLore(lore1);
        manageItems.setItemMeta(manageItemsMeta);
        inv.setItem(10, manageItems);

        ItemStack tradeRules = new ItemStack(Material.BOOK);
        ItemMeta tradeRulesMeta = tradeRules.getItemMeta();
        tradeRulesMeta.setDisplayName("Trade Rules");
        List<String> lore2 = new ArrayList<>();
        lore2.add("Some rules");
        tradeRulesMeta.setLore(lore2);
        tradeRules.setItemMeta(tradeRulesMeta);
        inv.setItem(12, tradeRules);

        ItemStack managePermissions = new ItemStack(Material.NAME_TAG);
        ItemMeta managePermissionsMeta = managePermissions.getItemMeta();
        managePermissionsMeta.setDisplayName("Manage Slots");
        List<String> lore3 = new ArrayList<>();
        lore3.add("Select what slots is for trade");
        managePermissionsMeta.setLore(lore3);
        managePermissions.setItemMeta(managePermissionsMeta);
        inv.setItem(14, managePermissions);

        player.openInventory(inv);
    }

}
