package fr.fallendeve2.fallencore;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class FallenCore extends JavaPlugin {

    private static FallenCore core;
    private final Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        logger.log(Level.INFO, "§a§lWe're enabling FallenCore !");
    }

    @Override
    public void onDisable() {
        logger.log(Level.INFO, "§4§lWe're disabling FallenCore !");
    }

    public static FallenCore getCore() {
        return core;
    }
}
