package at.cyndergames.API;

/**
 * Created by Minidodo on 25.06.2017.
 * <p>
 * #                          #
 * #   Copyright by Minidodo  #
 * #   and Scoocyjuice        #
 * #                          #
 */
@Deprecated
@SuppressWarnings("unused")
public interface Money {
    double getMoney(Object player);
    double setMoney(Object player, long money);
    double addMoney(Object player, long money);
    double removeMoney(Object player, long money);
    double createAccount(Object player);


}

