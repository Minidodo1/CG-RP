package at.cyndergames;

import at.cyndergames.API.*;
import at.cyndergames.enums.variablen;
import at.cyndergames.übersetzungen.de_DE;
import org.bukkit.Warning;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

/**
 * Created by Minidodo on 24.06.2017.
 * <p>
 * #                            #
 * #   Copyright by Minidodo    #
 * #   and Scoocyjuice          #
 * #                            #
 */
public class rp extends JavaPlugin {
    private de_DE languages = new de_DE();
    private MoneyAPI mAPI;
    @Override
    public void onEnable() {
        languages.createconf();
        defaults();
        new sysout(languages.get(variablen.PREFIX_LOADING) +" "+ languages.get(variablen.START));
        this.mAPI = new MoneyAPI();

    }
    @Override
    public void onDisable() {
        new sysout(languages.get(variablen.PREFIX_LOADING) + " " +languages.get(variablen.STOPP));
        super.onDisable();

    }
    private void defaults(){
        config config = new config();
        FileConfiguration cfg = config.getConfig(new File("configs/CG/","config.yml"));
                cfg.addDefault("Language","de_DE");
                config.saveConfig();

    }
    @SuppressWarnings("unused")
    public MoneyAPI getmAPI() {
        return mAPI;
    }
}
