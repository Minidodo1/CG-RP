package at.cyndergames.API;

import at.cyndergames.rp;
import org.bukkit.entity.Player;

/**
 * Created by Minidodo on 26.06.2017.
 * <p>
 * #                          #
 * #   Copyright by Minidodo  #
 * #   and Scoocyjuice        #
 * #                          #
 */
@SuppressWarnings("unused")
public class MoneyAPI {
    private MySQL sql;
    //TODO: -> MySQL, not YML!
        public MoneyAPI(rp rp){

            this.sql = rp.getSQL();
            sql.queryUpdate("CREATE TABLE  IF NOT EXISTS Geldbeutel (\n" +
                    "    ID int NOT NULL,\n" +
                    "    UUID varchar(255) NOT NULL,\n" +
                    "    Money double ,\n" +
                    "    PRIMARY KEY (ID)\n" +
                    "\t); ");
            }
        public double getMoney(Player player) {
            //TODO: sql.queryUpdate("QUERY");
            return 0;
        }

        public void setMoney(Player player, double money) {

            //TODO: sql.queryUpdate("QUERY");
                    }

        public void addMoney(Player player, double money) {
            //TODO: sql.queryUpdate("QUERY");

        }

        public void removeMoney(Player player, double money) {
            //TODO: sql.queryUpdate("QUERY");
        }

        public void createAccount(Player player) {
            //TODO: sql.queryUpdate("QUERY");
        }
}
