package at.cyndergames.übersetzungen;

import at.cyndergames.API.config;
import at.cyndergames.API.syserr;
import at.cyndergames.API.sysout;
import at.cyndergames.enums.variablen;
import org.bukkit.configuration.file.FileConfiguration;
import java.io.File;
import java.util.HashMap;

/**
 * Created by Minidodo on 25.06.2017.
 * <p>
 * #                          #
 * #   Copyright by Minidodo  #
 * #   and Scoocyjuice        #
 * #                          #
 */
public class de_DE {
    private String
            PREFIX,
            PREFIX_LOADING,
            STOPP,
            START;
    private HashMap<String, String> hm = new HashMap<String, String>();
    private config config = new config();
    private String Language = config.getConfig(new File("configs/Core/","config.yml")).getString("Language");
    private FileConfiguration cfg = config.getConfig(new File("languages/", Language+".yml"));
    public void createconf() {

        cfg.addDefault("PREFIX", "§6[§2CG§6-§2Core§6]");
        cfg.addDefault("PREFIX_LOADING","[CG-Core]");
        cfg.addDefault("STOPP", "stoppe Plugin...");
        cfg.addDefault("START", "Beginne mit dem Laden des Plugins..");
        cfg.options().copyDefaults(true);
        config.saveConfig();
        loadconf();

        config.clean();
    }
    private void loadconf(){
        //this.PREFIX = cfg.getString("PREFIX");
        //this.PREFIX_LOADING = cfg.getString("PREFIX_LOADING");
        //this.START = cfg.getString("START");
        //this.STOPP = cfg.getString("STOPP");
        this.hm.put("PREFIX", cfg.getString("PREFIX"));
        this.hm.put("PREFIX_LOADING", cfg.getString("PREFIX_LOADING"));
        this.hm.put("START", cfg.getString("START"));
        this.hm.put("STOPP", cfg.getString("STOPP"));
    }

    public Object get(variablen key) {
        return this.hm.get(key.toString());
    }
}
