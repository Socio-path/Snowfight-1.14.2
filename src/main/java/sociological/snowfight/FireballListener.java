package sociological.snowfight;

import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class FireballListener implements Listener {
    @EventHandler
    public void onFireballClicked(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() != null && event.getItem().getType() == Material.FIRE_CHARGE) {
            Fireball fireball = player.getWorld().spawn(player.getEyeLocation(), Fireball.class);
            fireball.setShooter(player);
        }
    }
}
