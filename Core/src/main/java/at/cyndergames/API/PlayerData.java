package at.cyndergames.API;

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
/*
 *  Get The PlayerData Via the Mainclass,
 *  in the HashMap PD is every online Player
 *  as Key, and the PlayerData as Value.
 *  Every Normal Action, like with the normal
 *  Player Object is possible, when this class
 *  is done.
 *
 */
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
        return isPlayerTimeRelative();
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
        return 0;
    }

    public float getWalkSpeed() {
        return 0;
    }

    public void setTexturePack(String s) {

    }

    public void setResourcePack(String s) {

    }

    public void setResourcePack(String s, byte[] bytes) {

    }

    public Scoreboard getScoreboard() {
        return null;
    }

    public void setScoreboard(Scoreboard scoreboard) {

    }

    public boolean isHealthScaled() {
        return false;
    }

    public void setHealthScaled(boolean b) {

    }

    public void setHealthScale(double v) {

    }

    public double getHealthScale() {
        return 0;
    }

    public Entity getSpectatorTarget() {
        return null;
    }

    public void setSpectatorTarget(Entity entity) {

    }

    public void sendTitle(String s, String s1) {

    }

    public void sendTitle(String s, String s1, int i, int i1, int i2) {

    }

    public void resetTitle() {

    }

    public void spawnParticle(Particle particle, Location location, int i) {

    }

    public void spawnParticle(Particle particle, double v, double v1, double v2, int i) {

    }

    public <T> void spawnParticle(Particle particle, Location location, int i, T t) {

    }

    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, T t) {

    }

    public void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2) {

    }

    public void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5) {

    }

    public <T> void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, T t) {

    }

    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, T t) {

    }

    public void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, double v3) {

    }

    public void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, double v6) {

    }

    public <T> void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, double v3, T t) {

    }

    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, double v6, T t) {

    }

    public AdvancementProgress getAdvancementProgress(Advancement advancement) {
        return null;
    }

    public String getLocale() {
        return null;
    }

    public Map<String, Object> serialize() {
        return null;
    }

    public String getName() {
        return null;
    }

    public PlayerInventory getInventory() {
        return null;
    }

    public Inventory getEnderChest() {
        return null;
    }

    public MainHand getMainHand() {
        return null;
    }

    public boolean setWindowProperty(InventoryView.Property property, int i) {
        return false;
    }

    public InventoryView getOpenInventory() {
        return null;
    }

    public InventoryView openInventory(Inventory inventory) {
        return null;
    }

    public InventoryView openWorkbench(Location location, boolean b) {
        return null;
    }

    public InventoryView openEnchanting(Location location, boolean b) {
        return null;
    }

    public void openInventory(InventoryView inventoryView) {

    }

    public InventoryView openMerchant(Villager villager, boolean b) {
        return null;
    }

    public InventoryView openMerchant(Merchant merchant, boolean b) {
        return null;
    }

    public void closeInventory() {

    }

    public ItemStack getItemInHand() {
        return null;
    }

    public void setItemInHand(ItemStack itemStack) {

    }

    public ItemStack getItemOnCursor() {
        return null;
    }

    public void setItemOnCursor(ItemStack itemStack) {

    }

    public boolean hasCooldown(Material material) {
        return false;
    }

    public int getCooldown(Material material) {
        return 0;
    }

    public void setCooldown(Material material, int i) {

    }

    public boolean isSleeping() {
        return false;
    }

    public int getSleepTicks() {
        return 0;
    }

    public GameMode getGameMode() {
        return null;
    }

    public void setGameMode(GameMode gameMode) {

    }

    public boolean isBlocking() {
        return false;
    }

    public boolean isHandRaised() {
        return false;
    }

    public int getExpToLevel() {
        return 0;
    }

    public Entity getShoulderEntityLeft() {
        return null;
    }

    public void setShoulderEntityLeft(Entity entity) {

    }

    public Entity getShoulderEntityRight() {
        return null;
    }

    public void setShoulderEntityRight(Entity entity) {

    }

    public double getEyeHeight() {
        return 0;
    }

    public double getEyeHeight(boolean b) {
        return 0;
    }

    public Location getEyeLocation() {
        return null;
    }

    public List<Block> getLineOfSight(Set<Material> set, int i) {
        return null;
    }

    public Block getTargetBlock(HashSet<Byte> hashSet, int i) {
        return null;
    }

    public Block getTargetBlock(Set<Material> set, int i) {
        return null;
    }

    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> hashSet, int i) {
        return null;
    }

    public List<Block> getLastTwoTargetBlocks(Set<Material> set, int i) {
        return null;
    }

    public int getRemainingAir() {
        return 0;
    }

    public void setRemainingAir(int i) {

    }

    public int getMaximumAir() {
        return 0;
    }

    public void setMaximumAir(int i) {

    }

    public int getMaximumNoDamageTicks() {
        return 0;
    }

    public void setMaximumNoDamageTicks(int i) {

    }

    public double getLastDamage() {
        return 0;
    }

    public void setLastDamage(double v) {

    }

    public int getNoDamageTicks() {
        return 0;
    }

    public void setNoDamageTicks(int i) {

    }

    public Player getKiller() {
        return null;
    }

    public boolean addPotionEffect(PotionEffect potionEffect) {
        return false;
    }

    public boolean addPotionEffect(PotionEffect potionEffect, boolean b) {
        return false;
    }

    public boolean addPotionEffects(Collection<PotionEffect> collection) {
        return false;
    }

    public boolean hasPotionEffect(PotionEffectType potionEffectType) {
        return false;
    }

    public PotionEffect getPotionEffect(PotionEffectType potionEffectType) {
        return null;
    }

    public void removePotionEffect(PotionEffectType potionEffectType) {

    }

    public Collection<PotionEffect> getActivePotionEffects() {
        return null;
    }

    public boolean hasLineOfSight(Entity entity) {
        return false;
    }

    public boolean getRemoveWhenFarAway() {
        return false;
    }

    public void setRemoveWhenFarAway(boolean b) {

    }

    public EntityEquipment getEquipment() {
        return null;
    }

    public void setCanPickupItems(boolean b) {

    }

    public boolean getCanPickupItems() {
        return false;
    }

    public boolean isLeashed() {
        return false;
    }

    public Entity getLeashHolder() {
        return null;
    }

    public boolean setLeashHolder(Entity entity) {
        return false;
    }

    public boolean isGliding() {
        return false;
    }

    public void setGliding(boolean b) {

    }

    public void setAI(boolean b) {

    }

    public boolean hasAI() {
        return false;
    }

    public void setCollidable(boolean b) {

    }

    public boolean isCollidable() {
        return false;
    }

    public AttributeInstance getAttribute(Attribute attribute) {
        return null;
    }

    public void damage(double v) {

    }

    public void damage(double v, Entity entity) {

    }

    public double getHealth() {
        return 0;
    }

    public void setHealth(double v) {

    }

    public double getMaxHealth() {
        return 0;
    }

    public void setMaxHealth(double v) {

    }

    public void resetMaxHealth() {

    }

    public Location getLocation() {
        return null;
    }

    public Location getLocation(Location location) {
        return null;
    }

    public void setVelocity(Vector vector) {

    }

    public Vector getVelocity() {
        return null;
    }

    public double getHeight() {
        return 0;
    }

    public double getWidth() {
        return 0;
    }

    public boolean isOnGround() {
        return false;
    }

    public World getWorld() {
        return null;
    }

    public boolean teleport(Location location) {
        return false;
    }

    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause teleportCause) {
        return false;
    }

    public boolean teleport(Entity entity) {
        return false;
    }

    public boolean teleport(Entity entity, PlayerTeleportEvent.TeleportCause teleportCause) {
        return false;
    }

    public List<Entity> getNearbyEntities(double v, double v1, double v2) {
        return null;
    }

    public int getEntityId() {
        return 0;
    }

    public int getFireTicks() {
        return 0;
    }

    public int getMaxFireTicks() {
        return 0;
    }

    public void setFireTicks(int i) {

    }

    public void remove() {

    }

    public boolean isDead() {
        return false;
    }

    public boolean isValid() {
        return false;
    }

    public void sendMessage(String s) {

    }

    public void sendMessage(String[] strings) {

    }

    public Server getServer() {
        return null;
    }

    public Entity getPassenger() {
        return null;
    }

    public boolean setPassenger(Entity entity) {
        return false;
    }

    public List<Entity> getPassengers() {
        return null;
    }

    public boolean addPassenger(Entity entity) {
        return false;
    }

    public boolean removePassenger(Entity entity) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean eject() {
        return false;
    }

    public float getFallDistance() {
        return 0;
    }

    public void setFallDistance(float v) {

    }

    public void setLastDamageCause(EntityDamageEvent entityDamageEvent) {

    }

    public EntityDamageEvent getLastDamageCause() {
        return null;
    }

    public UUID getUniqueId() {
        return null;
    }

    public int getTicksLived() {
        return 0;
    }

    public void setTicksLived(int i) {

    }

    public void playEffect(EntityEffect entityEffect) {

    }

    public EntityType getType() {
        return null;
    }

    public boolean isInsideVehicle() {
        return false;
    }

    public boolean leaveVehicle() {
        return false;
    }

    public Entity getVehicle() {
        return null;
    }

    public void setCustomNameVisible(boolean b) {

    }

    public boolean isCustomNameVisible() {
        return false;
    }

    public void setGlowing(boolean b) {

    }

    public boolean isGlowing() {
        return false;
    }

    public void setInvulnerable(boolean b) {

    }

    public boolean isInvulnerable() {
        return false;
    }

    public boolean isSilent() {
        return false;
    }

    public void setSilent(boolean b) {

    }

    public boolean hasGravity() {
        return false;
    }

    public void setGravity(boolean b) {

    }

    public int getPortalCooldown() {
        return 0;
    }

    public void setPortalCooldown(int i) {

    }

    public Set<String> getScoreboardTags() {
        return null;
    }

    public boolean addScoreboardTag(String s) {
        return false;
    }

    public boolean removeScoreboardTag(String s) {
        return false;
    }

    public PistonMoveReaction getPistonMoveReaction() {
        return null;
    }

    public String getCustomName() {
        return null;
    }

    public void setCustomName(String s) {

    }

    public void setMetadata(String s, MetadataValue metadataValue) {

    }

    public List<MetadataValue> getMetadata(String s) {
        return null;
    }

    public boolean hasMetadata(String s) {
        return false;
    }

    public void removeMetadata(String s, Plugin plugin) {

    }

    public boolean isPermissionSet(String s) {
        return false;
    }

    public boolean isPermissionSet(Permission permission) {
        return false;
    }

    public boolean hasPermission(String s) {
        return false;
    }

    public boolean hasPermission(Permission permission) {
        return false;
    }

    public PermissionAttachment addAttachment(Plugin plugin, String s, boolean b) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin, String s, boolean b, int i) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin, int i) {
        return null;
    }

    public void removeAttachment(PermissionAttachment permissionAttachment) {

    }

    public void recalculatePermissions() {

    }

    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;
    }

    public boolean isOp() {
        return false;
    }

    public void setOp(boolean b) {

    }

    public void sendPluginMessage(Plugin plugin, String s, byte[] bytes) {

    }

    public Set<String> getListeningPluginChannels() {
        return null;
    }

    public <T extends Projectile> T launchProjectile(Class<? extends T> aClass) {
        return null;
    }

    public <T extends Projectile> T launchProjectile(Class<? extends T> aClass, Vector vector) {
        return null;
    }
}
