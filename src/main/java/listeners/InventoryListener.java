package listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryListener implements Listener {

    @EventHandler
    public void onPlayerClickGui(InventoryClickEvent event) {
        if(event.getView().getTitle().equals("Admin Gui")) {
            event.setCancelled(true);

            Player player = (Player) event.getWhoClicked();
            ItemStack clickedItem = event.getCurrentItem();

            if (clickedItem != null && clickedItem.hasItemMeta()) {
                String itemName = clickedItem.getItemMeta().getDisplayName();

                switch (itemName) {
                    case "Manage Items":
                        System.out.println("test");
                }
            }
        }
    }

}
