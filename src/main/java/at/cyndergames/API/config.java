package at.cyndergames.API;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * Created by Minidodo on 25.06.2017.
 * <p>
 * #                          #
 * #   Copyright by Minidodo  #
 * #   and Scoocyjuice        #
 * #                          #
 */
public class config {
    private YamlConfiguration cfg;
    private File f;

    public FileConfiguration getConfig(File f){
        this.cfg = YamlConfiguration.loadConfiguration(f);
        this.f = f;
        return this.cfg;
    }
    public void saveConfig(){
        try {
            this.cfg.options().copyDefaults(true);
            this.cfg.save(this.f);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void clean(){
        this.f = null;
        this.cfg = null;
    }

}
