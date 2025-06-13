package net.maxmushroom.creepernoboom.listeners;

import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class CreeperListener implements Listener {
    @EventHandler
    public void onCreeperExplode(EntityExplodeEvent event) {
        if (event.getEntity() instanceof Creeper) {
            event.getEntity().getWorld().playSound(event.getEntity().getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
            event.getEntity().getWorld().spawnParticle(Particle.EXPLOSION_EMITTER, event.getEntity().getLocation(), 1);
            event.setCancelled(true);
        }
    }

}
