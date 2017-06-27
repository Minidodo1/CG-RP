package at.cyndergames;

import at.cyndergames.API.sysout;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Minidodo on 25.06.2017.
 * <p>
 * #                          #
 * #   Copyright by Minidodo  #
 * #   and Scoocyjuice        #
 * #                          #
 */
public class ticket extends JavaPlugin {
    @Override
    public void onEnable() {
        new sysout("Hello, from tickets!");
        super.onEnable();

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
