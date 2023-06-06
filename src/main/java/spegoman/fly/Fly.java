package spegoman.fly;

import org.bukkit.plugin.java.JavaPlugin;
import spegoman.fly.commands.Flycom;

public final class Fly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("fly").setExecutor(new Flycom());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
