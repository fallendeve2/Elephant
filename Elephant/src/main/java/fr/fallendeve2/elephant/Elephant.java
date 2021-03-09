package fr.fallendeve2.elephant;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Elephant extends JavaPlugin {

    private static Elephant elephant;
    private final Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        log.log(Level.INFO, "§aEnabled plugin !");
    }

    @Override
    public void onDisable() {
        log.log(Level.INFO, "§4Disabled plugin !");
    }

    public static Elephant getElephant() {
        return elephant;
    }

}
