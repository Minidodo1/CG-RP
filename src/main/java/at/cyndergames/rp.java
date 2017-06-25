package at.cyndergames;

import at.cyndergames.übersetzungen.de_DE;
import org.bukkit.plugin.java.JavaPlugin;

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
        System.out.println(de_DE.PREFIX_LOADING);
    }
    @Override
    public void onDisable() {
        System.out.println(de_DE.STOPP);
        super.onDisable();
    }
}
