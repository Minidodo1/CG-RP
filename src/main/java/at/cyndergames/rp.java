package at.cyndergames;

import org.bukkit.plugin.java.JavaPlugin;
import at.cyndergames.Enums.de_DE;

/**
 * Created by Minidodo on 24.06.2017.
 * <p>
 * #                            #
 * #   Copyright by Minidodo    #
 * #   and Scoocyjuice          #
 * #                            #
 */
public class rp extends JavaPlugin {


    @Override
    public void onEnable() {
    System.out.println(de_DE.LOADING);
    }
    @Override
    public void onDisable() {
        System.out.println(de_DE.STOPP);
        super.onDisable();
    }
}
