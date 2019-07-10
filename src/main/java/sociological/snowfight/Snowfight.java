package sociological.snowfight;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Snowfight extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new ProjectileListener(), this);
        pluginManager.registerEvents(new DamageListener(), this);
        pluginManager.registerEvents(new UseItemListener(), this);
        pluginManager.registerEvents(new ProjectileHitListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
