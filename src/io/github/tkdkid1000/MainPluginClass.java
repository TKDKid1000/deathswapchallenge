package io.github.tkdkid1000;

import org.bukkit.plugin.java.JavaPlugin;

public class MainPluginClass extends JavaPlugin {

    @Override
    public void onEnable() {
    	this.getCommand("startdeathswap").setExecutor(new StartDeathSwap());
    }
    
    @Override
    public void onDisable() {

    }
    // This method checks for incoming players and sends them a message
}
