package at.cyndergames;

import at.cyndergames.API.*;
import at.cyndergames.enums.variablen;
import at.cyndergames.übersetzungen.de_DE;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.craftbukkit.v1_12_R1.util.CraftMagicNumbers;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.HashMap;

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
    private MySQL sql;
    private PlayerData pd;
    private HashMap PD;
    @Override
    public void onEnable() {
        languages.createconf();

        defaults();
        new sysout(languages.get(variablen.PREFIX_LOADING) +" "+ languages.get(variablen.START));
        this.sql = new MySQL();
        this.mAPI = new MoneyAPI(this);
        PluginManager pm = this.getServer().getPluginManager();
        PD = new HashMap();
    }
    @Override
    public void onDisable() {
        new sysout(languages.get(variablen.PREFIX_LOADING) + " " +languages.get(variablen.STOPP));
        super.onDisable();

    }
    private void defaults(){
        config config = new config();
        FileConfiguration cfg = config.getConfig(new File("configs/Core/","config.yml"));
                cfg.addDefault("Language","de_DE");
                config.saveConfig();

    }
    @SuppressWarnings("unused")
    public MoneyAPI getmAPI() {
        return mAPI;
    }
    @SuppressWarnings("unused")
    public MySQL getSQL(){
        return sql;
    }

    @EventHandler
    public void OPJ(PlayerJoinEvent e){
        if(!PD.containsKey(e.getPlayer().getName())) {
            PD.put(e.getPlayer().getName(), new PlayerData(e.getPlayer()));
        }
    }

    @EventHandler
    public void OPQ(PlayerQuitEvent e){
        if(PD.containsKey(e.getPlayer().getName())){
            PD.remove(e.getPlayer());
        }
    }
}
