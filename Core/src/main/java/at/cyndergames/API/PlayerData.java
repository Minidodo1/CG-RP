package at.cyndergames.API;

import at.cyndergames.rp;
import org.bukkit.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.*;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.Vector;

import java.net.InetSocketAddress;
import java.util.*;

/**
 * Created by Cedric on 19.07.2017.
 */
@SuppressWarnings("unused")
public class PlayerData implements Player{
    private Player p;
    private rp Core = new rp();
/**
 *  Get The PlayerData Via the Mainclass,
 *  in the HashMap PD is every online Player
 *  as Key, and the PlayerData as Value.
 *  Every Normal Action, like with the normal
 *  Player Object is possible, when this class
 *  is done.
 *
 */
















/**
 *
 *Here are the DEFAUlt Methods
 *
 **/
    public PlayerData(Player p){
    this.p = p;
    }

    public String getDisplayName() {
        return p.getDisplayName();
    }

    public void setDisplayName(String s) {
        p.setDisplayName(s);
    }

    public String getPlayerListName() {
        return p.getPlayerListName();
    }

    public void setPlayerListName(String s) {
            p.setPlayerListName(s);

    }
    public void setCompassTarget(Location location) {
        p.setCompassTarget(location);
    }


    public Location getCompassTarget() {
        return p.getCompassTarget();
    }

    public InetSocketAddress getAddress() {
        return p.getAddress();
    }

    public boolean isConversing() {
        return p.isConversing();
    }

    public void acceptConversationInput(String s) {
            p.acceptConversationInput(s);
    }

    public boolean beginConversation(Conversation conversation) {
        return p.beginConversation(conversation);
    }

    public void abandonConversation(Conversation conversation) {
        p.abandonConversation(conversation);
    }

    public void abandonConversation(Conversation conversation, ConversationAbandonedEvent conversationAbandonedEvent) {
        p.abandonConversation(conversation, conversationAbandonedEvent);
    }

    public void sendRawMessage(String s) {
        p.sendRawMessage(s);
    }

    public void kickPlayer(String s) {
        p.kickPlayer(s);
    }

    public void chat(String s) {
        p.chat(s);
    }

    public boolean performCommand(String s) {
        return p.performCommand(s);
    }

    public boolean isSneaking() {
        return false;
    }

    public void setSneaking(boolean b) {
        p.setSneaking(b);
    }

    public boolean isSprinting() {
        return p.isSprinting();
    }

    public void setSprinting(boolean b) {
        p.setSprinting(b);
    }

    public void saveData() {
        p.saveData();
    }

    public void loadData() {
        p.loadData();
    }

    public void setSleepingIgnored(boolean b) {
        p.setSleepingIgnored(b);
    }

    public boolean isSleepingIgnored() {
        return p.isSleepingIgnored();
    }

    @Deprecated
    public void playNote(Location location, byte b, byte b1) {
        p.playNote(location, b, b1);
    }

    public void playNote(Location location, Instrument instrument, Note note) {
        p.playNote(location, instrument, note);
    }

    public void playSound(Location location, Sound sound, float v, float v1) {
        p.playSound(location, sound, v, v1);
    }
    public void playSound(Location location, String s, float v, float v1) {
        p.playSound(location, s,v, v1);
    }

    public void playSound(Location location, Sound sound, SoundCategory soundCategory, float v, float v1) {
        p.playSound(location, sound, soundCategory, v, v1);
    }

    public void playSound(Location location, String s, SoundCategory soundCategory, float v, float v1) {
        p.playSound(location, s, soundCategory, v, v1);
    }

    public void stopSound(Sound sound) {
        p.stopSound(sound);
    }

    public void stopSound(String s) {
        p.stopSound(s);
    }

    public void stopSound(Sound sound, SoundCategory soundCategory) {
        p.stopSound(sound, soundCategory);
    }

    public void stopSound(String s, SoundCategory soundCategory) {
        p.stopSound(s, soundCategory);
    }
    @Deprecated
    public void playEffect(Location location, Effect effect, int i) {
        p.playEffect(location, effect, i);
    }

    public <T> void playEffect(Location location, Effect effect, T t) {
        p.playEffect(location, effect, t);
    }
    @Deprecated
    public void sendBlockChange(Location location, Material material, byte b) {
        p.sendBlockChange(location, material, b);
    }
    @Deprecated
    public boolean sendChunkChange(Location location, int i, int i1, int i2, byte[] bytes) {
        return p.sendChunkChange(location, i, i1, i2, bytes);
    }
    @Deprecated
    public void sendBlockChange(Location location, int i, byte b) {
        p.sendBlockChange(location, i, b);
    }

    public void sendSignChange(Location location, String[] strings) {
            p.sendSignChange(location, strings);
    }

    public void sendMap(MapView mapView) {
        p.sendMap(mapView);
    }
    @Deprecated
    public void updateInventory() {
        p.updateInventory();
    }
    @Deprecated
    public void awardAchievement(Achievement achievement) {
        p.awardAchievement(achievement);
    }
    @Deprecated
    public void removeAchievement(Achievement achievement) {
        p.removeAchievement(achievement);
    }
    @Deprecated
    public boolean hasAchievement(Achievement achievement) {
        return p.hasAchievement(achievement);
    }

    public void incrementStatistic(Statistic statistic){
        p.incrementStatistic(statistic);
    }

    public void decrementStatistic(Statistic statistic) {
        p.decrementStatistic(statistic);
    }

    public void incrementStatistic(Statistic statistic, int i) {
        p.incrementStatistic(statistic, i);
    }

    public void decrementStatistic(Statistic statistic, int i) {
    p.decrementStatistic(statistic, i);
    }

    public void setStatistic(Statistic statistic, int i) {
        p.setStatistic(statistic, i);
    }

    public int getStatistic(Statistic statistic) {
        return p.getStatistic(statistic);
    }

    public void incrementStatistic(Statistic statistic, Material material) {
        p.incrementStatistic(statistic, material);
    }

    public void decrementStatistic(Statistic statistic, Material material) {
        p.decrementStatistic(statistic, material);
    }

    public int getStatistic(Statistic statistic, Material material) {
        return p.getStatistic(statistic, material);
    }

    public void incrementStatistic(Statistic statistic, Material material, int i) {
        p.incrementStatistic(statistic, material, i);
    }

    public void decrementStatistic(Statistic statistic, Material material, int i) {
        p.decrementStatistic(statistic, material, i);
    }

    public void setStatistic(Statistic statistic, Material material, int i) {
        p.setStatistic(statistic, material, i);
    }

    public void incrementStatistic(Statistic statistic, EntityType entityType) {
        p.incrementStatistic(statistic, entityType);
    }

    public void decrementStatistic(Statistic statistic, EntityType entityType) {
        p.decrementStatistic(statistic, entityType);
    }

    public int getStatistic(Statistic statistic, EntityType entityType) {
        return p.getStatistic(statistic, entityType);
    }

    public void incrementStatistic(Statistic statistic, EntityType entityType, int i) {
        p.incrementStatistic(statistic, entityType, i);
    }

    public void decrementStatistic(Statistic statistic, EntityType entityType, int i) {
        p.decrementStatistic(statistic, entityType, i);
    }

    public void setStatistic(Statistic statistic, EntityType entityType, int i) {
        p.setStatistic(statistic, entityType, i);
    }

    public void setPlayerTime(long l, boolean b) {
        p.setPlayerTime(l, b);
    }

    public long getPlayerTime() {
        return p.getPlayerTime();
    }

    public long getPlayerTimeOffset() {
        return p.getPlayerTimeOffset();
    }

    public boolean isPlayerTimeRelative() {
        return p.isPlayerTimeRelative();
    }

    public void resetPlayerTime() {
        p.resetPlayerTime();
    }

    public void setPlayerWeather(WeatherType weatherType) {
        p.setPlayerWeather(weatherType);
    }

    public WeatherType getPlayerWeather() {
        return p.getPlayerWeather();
    }

    public void resetPlayerWeather() {
        p.resetPlayerWeather();
    }

    public void giveExp(int i) {
        p.giveExp(i);
    }

    public void giveExpLevels(int i) {
        p.giveExpLevels(i);
    }

    public float getExp() {
        return p.getExp();
    }

    public void setExp(float v) {
        p.setExp(v);
    }

    public int getLevel() {
        return p.getLevel();
    }

    public void setLevel(int i) {
        p.setLevel(i);
    }

    public int getTotalExperience() {
        return p.getTotalExperience();
    }

    public void setTotalExperience(int i) {
        p.setTotalExperience(i);
    }

    public float getExhaustion() {
        return p.getExhaustion();
    }

    public void setExhaustion(float v) {
        p.setExhaustion(v);
    }

    public float getSaturation() {
        return p.getSaturation();
    }

    public void setSaturation(float v) {
        p.setSaturation(v);
    }

    public int getFoodLevel() {
        return p.getFoodLevel();
    }

    public void setFoodLevel(int i) {
        p.setFoodLevel(i);
    }

    public boolean isOnline() {
        return p.isOnline();
    }

    public boolean isBanned() {
        return p.isBanned();
    }

    public boolean isWhitelisted() {
        return p.isWhitelisted();
    }

    public void setWhitelisted(boolean b) {
        p.setWhitelisted(b);
    }

    public Player getPlayer() {
        return p.getPlayer();
    }

    public long getFirstPlayed() {
        return p.getFirstPlayed();
    }

    public long getLastPlayed() {
        return p.getLastPlayed();
    }

    public boolean hasPlayedBefore() {
        return p.hasPlayedBefore();
    }

    public Location getBedSpawnLocation() {
        return p.getBedSpawnLocation();
    }

    public void setBedSpawnLocation(Location location) {
        p.setBedSpawnLocation(location);
    }

    public void setBedSpawnLocation(Location location, boolean b) {
        p.setBedSpawnLocation(location, b);
    }

    public boolean getAllowFlight() {
        return p.getAllowFlight();
    }
    public void setAllowFlight(boolean b) {
        p.setAllowFlight(b);
    }

    public void hidePlayer(Player player) {
        p.hidePlayer(player);
    }

    public void showPlayer(Player player) {
        p.showPlayer(player);
    }

    public boolean canSee(Player player) {
        return p.canSee(player);
    }

    public boolean isFlying() {
        return p.isFlying();
    }

    public void setFlying(boolean b) {
        p.setFlying(b);
    }

    public void setFlySpeed(float v) {
        p.setFlySpeed(v);
    }

    public void setWalkSpeed(float v) {
        p.setWalkSpeed(v);
    }

    public float getFlySpeed() {
        return p.getFlySpeed();
    }

    public float getWalkSpeed() {
        return p.getWalkSpeed();
    }

    @Deprecated
    public void setTexturePack(String s) {
        p.setTexturePack(s);
    }

    public void setResourcePack(String s) {
        p.setResourcePack(s);
    }

    public void setResourcePack(String s, byte[] bytes) {
        p.setResourcePack(s, bytes);
    }

    public Scoreboard getScoreboard() {
        return p.getScoreboard();
    }

    public void setScoreboard(Scoreboard scoreboard) {
        p.setScoreboard(scoreboard);
    }

    public boolean isHealthScaled() {
        return p.isHealthScaled();
    }

    public void setHealthScaled(boolean b) {
        p.setHealthScaled(b);
    }

    public void setHealthScale(double v) {
        p.setHealthScale(v);
    }

    public double getHealthScale() {
        return p.getHealthScale();
    }

    public Entity getSpectatorTarget() {
        return p.getSpectatorTarget();
    }

    public void setSpectatorTarget(Entity entity) {
        p.setSpectatorTarget(entity);
    }

    @Deprecated
    public void sendTitle(String s, String s1) {
        p.sendTitle(s, s1);
    }

    public void sendTitle(String s, String s1, int i, int i1, int i2) {
        p.sendTitle(s, s1, i, i1, i2);
    }

    public void resetTitle() {
        p.resetTitle();
    }

    public void spawnParticle(Particle particle, Location location, int i) {
        p.spawnParticle(particle, location, i);
    }

    public void spawnParticle(Particle particle, double v, double v1, double v2, int i) {
        p.spawnParticle(particle, v, v1, v2, i);
    }

    public <T> void spawnParticle(Particle particle, Location location, int i, T t) {
        p.spawnParticle(particle, location, i, t);
    }

    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, T t) {
        p.spawnParticle(particle, v, v1, v2, i, t);
    }

    public void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2) {
        p.spawnParticle(particle, location, i, v, v1, v2);
    }

    public void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5) {
        p.spawnParticle(particle, v, v1, v2, i, v3, v4, v5);
    }

    public <T> void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, T t) {
        p.spawnParticle(particle, location, i, v, v1, v2, t);
    }

    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, T t) {
        p.spawnParticle(particle, v, v1, v2, i, v3, v4, v5, t);
    }

    public void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, double v3) {
        p.spawnParticle(particle, location, i, v, v1, v2, v3);
    }

    public void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, double v6) {
        p.spawnParticle(particle, v, v1, v2, i, v3, v4, v5, v6);
    }

    public <T> void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, double v3, T t) {
        p.spawnParticle(particle, location, i, v, v1, v2, v3, t);
    }

    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, double v6, T t) {
        p.spawnParticle(particle, v, v1, v2, i, v3, v4, v5, v6, t);
    }

    public AdvancementProgress getAdvancementProgress(Advancement advancement) {
        return p.getAdvancementProgress(advancement);
    }

    public String getLocale() {
        return p.getLocale();
    }

    @Override
    public Spigot spigot() {
        return null;
    }

    public Map<String, Object> serialize() {
        return p.serialize();
    }

    public String getName() {
        return p.getName();
    }

    public PlayerInventory getInventory() {
        return p.getInventory();
    }

    public Inventory getEnderChest() {
        return p.getEnderChest();
    }

    public MainHand getMainHand() {
        return p.getMainHand();
    }

    public boolean setWindowProperty(InventoryView.Property property, int i) {
        return p.setWindowProperty(property, i);
    }

    public InventoryView getOpenInventory() {
        return p.getOpenInventory();
    }

    public InventoryView openInventory(Inventory inventory) {
        return p.openInventory(inventory);
    }

    public InventoryView openWorkbench(Location location, boolean b) {
        return p.openWorkbench(location, b);
    }

    public InventoryView openEnchanting(Location location, boolean b) {
        return p.openEnchanting(location, b);
    }

    public void openInventory(InventoryView inventoryView) {
        p.openInventory(inventoryView);
    }

    public InventoryView openMerchant(Villager villager, boolean b) {
        return p.openMerchant(villager, b);
    }

    public InventoryView openMerchant(Merchant merchant, boolean b) {
        return p.openMerchant(merchant, b);
    }

    public void closeInventory() {
        p.closeInventory();
    }

    @Deprecated
    public ItemStack getItemInHand() {
        return p.getItemInHand();
    }

    @Deprecated
    public void setItemInHand(ItemStack itemStack) {
        p.setItemInHand(itemStack);
    }

    public ItemStack getItemOnCursor() {
        return p.getItemOnCursor();
    }

    public void setItemOnCursor(ItemStack itemStack) {
        p.setItemOnCursor(itemStack);
    }

    public boolean hasCooldown(Material material) {
        return p.hasCooldown(material);
    }

    public int getCooldown(Material material) {
        return p.getCooldown(material);
    }

    public void setCooldown(Material material, int i) {
        p.setCooldown(material, i);
    }

    public boolean isSleeping() {
        return p.isSleeping();
    }

    public int getSleepTicks() {
        return p.getSleepTicks();
    }

    public GameMode getGameMode() {
        return p.getGameMode();
    }

    public void setGameMode(GameMode gameMode) {
        p.setGameMode(gameMode);
    }

    public boolean isBlocking() {
        return p.isBlocking();
    }

    public boolean isHandRaised() {
        return p.isHandRaised();
    }

    public int getExpToLevel() {
        return p.getExpToLevel();
    }

    @Deprecated
    public Entity getShoulderEntityLeft() {
        return p.getShoulderEntityLeft();
    }

    @Deprecated
    public void setShoulderEntityLeft(Entity entity) {
        p.setShoulderEntityLeft(entity);
    }

    @Deprecated
    public Entity getShoulderEntityRight() {
        return p.getShoulderEntityRight();
    }

    @Deprecated
    public void setShoulderEntityRight(Entity entity) {
        p.setShoulderEntityLeft(entity);
    }

    public double getEyeHeight() {
        return p.getEyeHeight();
    }

    public double getEyeHeight(boolean b) {
        return p.getEyeHeight(b);
    }

    public Location getEyeLocation() {
        return p.getEyeLocation();
    }

    public List<Block> getLineOfSight(Set<Material> set, int i) {
        return p.getLineOfSight(set, i);
    }

    @Deprecated
    public Block getTargetBlock(HashSet<Material> hashSet, int i) {
        return p.getTargetBlock(hashSet, i);
    }

    public Block getTargetBlock(Set<Material> set, int i) {
        return p.getTargetBlock(set, i);
    }

    @Deprecated
    public List<Block> getLastTwoTargetBlocks(HashSet<Material> hashSet, int i) {
        return p.getLastTwoTargetBlocks(hashSet, i);
    }

    public List<Block> getLastTwoTargetBlocks(Set<Material> set, int i) {
        return p.getLastTwoTargetBlocks(set, i);
    }

    public int getRemainingAir() {
        return p.getRemainingAir();
    }

    public void setRemainingAir(int i) {
        p.setRemainingAir(i);
    }

    public int getMaximumAir() {
        return p.getMaximumAir();
    }

    public void setMaximumAir(int i) {
        p.setMaximumAir(i);
    }

    public int getMaximumNoDamageTicks() {
        return p.getMaximumNoDamageTicks();
    }

    public void setMaximumNoDamageTicks(int i) {
        p.setMaximumNoDamageTicks(i);
    }

    public double getLastDamage() {
        return p.getLastDamage();
    }

    public void setLastDamage(double v) {
        p.setLastDamage(v);
    }

    public int getNoDamageTicks() {
        return p.getNoDamageTicks();
    }

    public void setNoDamageTicks(int i) {
        p.setNoDamageTicks(i);
    }

    public Player getKiller() {
        return p.getKiller();
    }

    public boolean addPotionEffect(PotionEffect potionEffect) {
        return p.addPotionEffect(potionEffect);
    }

    public boolean addPotionEffect(PotionEffect potionEffect, boolean b) {
        return p.addPotionEffect(potionEffect, b);
    }

    public boolean addPotionEffects(Collection<PotionEffect> collection) {
        return p.addPotionEffects(collection);
    }

    public boolean hasPotionEffect(PotionEffectType potionEffectType) {
        return p.hasPotionEffect(potionEffectType);
    }

    public PotionEffect getPotionEffect(PotionEffectType potionEffectType) {
        return p.getPotionEffect(potionEffectType);
    }

    public void removePotionEffect(PotionEffectType potionEffectType) {
        p.removePotionEffect(potionEffectType);
    }

    public Collection<PotionEffect> getActivePotionEffects() {
        return p.getActivePotionEffects();
    }

    public boolean hasLineOfSight(Entity entity) {
        return p.hasLineOfSight(entity);
    }

    public boolean getRemoveWhenFarAway() {
        return p.getRemoveWhenFarAway();
    }

    public void setRemoveWhenFarAway(boolean b) {
        p.setRemoveWhenFarAway(b);
    }

    public EntityEquipment getEquipment() {
        return p.getEquipment();
    }

    public void setCanPickupItems(boolean b) {
        p.setCanPickupItems(b);
    }

    public boolean getCanPickupItems() {
        return p.getCanPickupItems();
    }

    public boolean isLeashed() {
        return p.isLeashed();
    }

    public Entity getLeashHolder() {
        return p.getLeashHolder();
    }

    public boolean setLeashHolder(Entity entity) {
        return p.setLeashHolder(entity);
    }

    public boolean isGliding() {
        return p.isGliding();
    }

    public void setGliding(boolean b) {
        p.setGliding(b);
    }

    public void setAI(boolean b) {
        p.setAI(b);
    }

    public boolean hasAI() {
        return p.hasAI();
    }

    public void setCollidable(boolean b) {
        p.setCollidable(b);
    }

    public boolean isCollidable() {
        return p.isCollidable();
    }

    public AttributeInstance getAttribute(Attribute attribute) {
        return p.getAttribute(attribute);
    }

    public void damage(double v) {
        p.damage(v);
    }

    public void damage(double v, Entity entity) {
        p.damage(v, entity);
    }

    public double getHealth() {
        return p.getHealth();
    }

    public void setHealth(double v) {
        p.setHealth(v);
    }

    @Deprecated
    public double getMaxHealth() {
        return p.getMaxHealth();
    }

    @Deprecated
    public void setMaxHealth(double v) {
        p.setMaxHealth(v);
    }

    @Deprecated
    public void resetMaxHealth() {
        p.resetMaxHealth();
    }

    public Location getLocation() {
        return p.getLocation();
    }

    public Location getLocation(Location location) {
        return p.getLocation(location);
    }

    public void setVelocity(Vector vector) {
    p.setVelocity(vector);
    }

    public Vector getVelocity() {
        return p.getVelocity();
    }

    public double getHeight() {
        return p.getHeight();
    }

    public double getWidth() {
        return p.getWidth();
    }

    public boolean isOnGround() {
        return p.isOnGround();
    }

    public World getWorld() {
        return p.getWorld();
    }

    public boolean teleport(Location location) {
        return p.teleport(location);
    }

    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause teleportCause) {
        return p.teleport(location, teleportCause);
    }

    public boolean teleport(Entity entity) {
        return p.teleport(entity);
    }

    public boolean teleport(Entity entity, PlayerTeleportEvent.TeleportCause teleportCause) {
        return p.teleport(entity, teleportCause);
    }

    public List<Entity> getNearbyEntities(double v, double v1, double v2) {
        return p.getNearbyEntities(v, v1, v2);
    }

    public int getEntityId() {
        return p.getEntityId();
    }

    public int getFireTicks() {
        return p.getFireTicks();
    }

    public int getMaxFireTicks() {
        return p.getMaxFireTicks();
    }

    public void setFireTicks(int i) {
        p.setFireTicks(i);
    }

    public void remove() {
        p.remove();
    }

    public boolean isDead() {
        return p.isDead();
    }

    public boolean isValid() {
        return p.isValid();
    }

    public void sendMessage(String s) {
        p.sendMessage(s);
    }

    public void sendMessage(String[] strings) {
        p.sendMessage(strings);
    }

    public Server getServer() {
        return p.getServer();
    }

    @Deprecated
    public Entity getPassenger() {
        return p.getPassenger();
    }

    @Deprecated
    public boolean setPassenger(Entity entity) {
        return p.setPassenger(entity);
    }

    public List<Entity> getPassengers() {
        return p.getPassengers();
    }

    public boolean addPassenger(Entity entity) {
        return p.addPassenger(entity);
    }

    public boolean removePassenger(Entity entity) {
        return p.removePassenger(entity);
    }

    public boolean isEmpty() {
        return p.isEmpty();
    }

    public boolean eject() {
        return p.eject();
    }

    public float getFallDistance() {
        return p.getFallDistance();
    }

    public void setFallDistance(float v) {
        p.setFallDistance(v);
    }

    public void setLastDamageCause(EntityDamageEvent entityDamageEvent) {
        p.setLastDamageCause(entityDamageEvent);
    }

    public EntityDamageEvent getLastDamageCause() {
        return p.getLastDamageCause();
    }

    public UUID getUniqueId() {
        return p.getUniqueId();
    }

    public int getTicksLived() {
        return p.getTicksLived();
    }

    public void setTicksLived(int i) {
        p.setTicksLived(i);
    }

    public void playEffect(EntityEffect entityEffect) {
        p.playEffect(entityEffect);
    }

    public EntityType getType() {
        return p.getType();
    }

    public boolean isInsideVehicle() {
        return p.isInsideVehicle();
    }

    public boolean leaveVehicle() {
        return p.leaveVehicle();
    }

    public Entity getVehicle() {
        return p.getVehicle();
    }

    public void setCustomNameVisible(boolean b) {
        p.setCustomNameVisible(b);
    }

    public boolean isCustomNameVisible() {
        return p.isCustomNameVisible();
    }

    public void setGlowing(boolean b) {
        p.setGlowing(b);
    }

    public boolean isGlowing() {
        return p.isGlowing();
    }

    public void setInvulnerable(boolean b) {
        p.isInvulnerable();
    }

    public boolean isInvulnerable() {
        return p.isInvulnerable();
    }

    public boolean isSilent() {
        return p.isSilent();
    }

    public void setSilent(boolean b) {
        p.setSilent(b);
    }

    public boolean hasGravity() {
        return p.hasGravity();
    }

    public void setGravity(boolean b) {
        p.setGravity(b);
    }

    public int getPortalCooldown() {
        return p.getPortalCooldown();
    }

    public void setPortalCooldown(int i) {
        p.setPortalCooldown(i);
    }

    public Set<String> getScoreboardTags() {
        return p.getScoreboardTags();
    }

    public boolean addScoreboardTag(String s) {
        return p.addScoreboardTag(s);
    }

    public boolean removeScoreboardTag(String s) {
        return p.removeScoreboardTag(s);
    }

    public PistonMoveReaction getPistonMoveReaction() {
        return p.getPistonMoveReaction();
    }

    public String getCustomName() {
        return p.getCustomName();
    }

    public void setCustomName(String s) {
        p.setCustomName(s);
    }

    public void setMetadata(String s, MetadataValue metadataValue) {
        p.setMetadata(s, metadataValue);
    }

    public List<MetadataValue> getMetadata(String s) {
        return p.getMetadata(s);
    }

    public boolean hasMetadata(String s) {
        return p.hasMetadata(s);
    }

    public void removeMetadata(String s, Plugin plugin) {
        p.removeMetadata(s, plugin);
    }

    public boolean isPermissionSet(String s) {
        return p.isPermissionSet(s);
    }

    public boolean isPermissionSet(Permission permission) {
        return p.isPermissionSet(permission);
    }

    public boolean hasPermission(String s) {
        return p.hasPermission(s);
    }

    public boolean hasPermission(Permission permission) {
        return p.hasPermission(permission);
    }

    public PermissionAttachment addAttachment(Plugin plugin, String s, boolean b) {
        return p.addAttachment(plugin, s, b);
    }

    public PermissionAttachment addAttachment(Plugin plugin) {
        return p.addAttachment(plugin);
    }

    public PermissionAttachment addAttachment(Plugin plugin, String s, boolean b, int i) {
        return p.addAttachment(plugin, s, b, i);
    }

    public PermissionAttachment addAttachment(Plugin plugin, int i) {
        return p.addAttachment(plugin, i);
    }

    public void removeAttachment(PermissionAttachment permissionAttachment) {
        p.removeAttachment(permissionAttachment);
    }

    public void recalculatePermissions() {
        p.recalculatePermissions();
    }

    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return p.getEffectivePermissions();
    }

    public boolean isOp() {
        return p.isOp();
    }

    public void setOp(boolean b) {
        p.setOp(b);
    }

    public void sendPluginMessage(Plugin plugin, String s, byte[] bytes) {
        p.sendPluginMessage(plugin, s, bytes);
    }

    public Set<String> getListeningPluginChannels() {
        return p.getListeningPluginChannels();
    }

    public <T extends Projectile> T launchProjectile(Class<? extends T> aClass) {
        return p.launchProjectile(aClass);
    }

    public <T extends Projectile> T launchProjectile(Class<? extends T> aClass, Vector vector) {
        return p.launchProjectile(aClass, vector);
    }
}
