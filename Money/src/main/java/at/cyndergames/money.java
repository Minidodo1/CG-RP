package at.cyndergames;

import org.bukkit.plugin.java.JavaPlugin;
import at.cyndergames.rp;
import java.io.File;

/**
 * Created by Minidodo on 24.06.2017.
 * <p>
 * #                            #
 * #   Copyright by Minidodo    #
 * #   and Scoocyjuice          #
 * #                            #
 */
public class money extends JavaPlugin {
    private MoneyAPI mAPI;
    private rp core;
    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        core = new rp();
    }

}
