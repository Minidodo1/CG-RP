package at.cyndergames.API;

import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.io.IOException;
import java.sql.*;

/**
 * Created by Minidodo on 26.06.2017.
 * <p>
 * #                          #
 * #   Copyright by Minidodo  #
 * #   and Scoocyjuice        #
 * #                          #
 */
public class MySQL {
    private String host, user, password, database;
    private int port;
    private Connection conn;
    private config config = new config();
    private FileConfiguration cfg;

    public MySQL() throws Exception{
        cfg = config.getConfig(new File("configs/","database.cfg"));
        String db = "MySQL.";
        cfg.addDefault(db + "host", "localhost");
        cfg.addDefault(db + "port", 3306);
        cfg.addDefault(db + "user", "user");
        cfg.addDefault(db + "password", "password");
        cfg.addDefault(db + "database", "database");
        cfg.addDefault(db + "broadcastconnection", false);
        cfg.options().copyDefaults(true);

        config.saveConfig();
        config.clean();
        this.host = cfg.getString(db +"host");
        this.port = cfg.getInt(db +"port");
        this.user = cfg.getString(db +"user");
        this.password = cfg.getString(db +"password");
        this.database = cfg.getString(db +"database");

        this.conn = this.openConnection();
    }

    public Connection openConnection() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://"+this.host+":"+this.port+"/"+this.database, this.user, this.password);

        this.conn = DriverManager.getConnection("jdbc:mysql://"+this.host+":"+this.port+"/"+this.database, this.user, this.password);
        return conn;
    }
    public Connection getConnection(){
        return this.conn;
    }
    @SuppressWarnings("all")
    public boolean hasConnection(){
        try {
            return this.conn != null || this.conn.isValid(28800);

        } catch (SQLException e) {
            return false;
        }
    }
    public void queryUpdate(String query) throws Exception{
        openConnection();
        Connection conn = this.conn;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            new syserr("[ERROR] SQLExeption:queryupdate");
        }finally{
            this.closeResources(null, ps);
        }
    }
    public void closeResources(ResultSet rs, PreparedStatement ps) throws SQLException{
        if(rs != null){
            rs.close();
        }
        if(ps !=null){
            ps.close();

        }
    }
    public void closeConnection(){
        try {
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.conn = null;
        }
    }

}
