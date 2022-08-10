package org.cardboardpowered.util;

public class KnownEvents {

    public static String[] EVENTS = {
            "ThrownEggHatchEvent", // from Paper
            "BlockBreakEvent",
            "BlockBurnEvent",
            "BlockCanBuildEvent",
            "BlockCookEvent",
            "BlockDamageEvent",
            "BlockDispenseArmorEvent",
            "BlockDispenseEvent",
            "BlockDropItemEvent",
            "BlockExpEvent",
            "BlockExplodeEvent",
            "BlockFadeEvent",
            "BlockFertilizeEvent",
            "BlockFormEvent",
            "BlockFromToEvent",
            "BlockGrowEvent",
            "BlockIgniteEvent",
            "BlockMultiPlaceEvent",
            "BlockPhysicsEvent",
            "BlockPistonEvent",
            "BlockPistonExtendEvent",
            "BlockPistonRetractEvent",
            "BlockPlaceEvent",
            "BlockReceiveGameEvent",
            "BlockRedstoneEvent",
            "BlockShearEntityEvent",
            "BlockSpreadEvent",
            "CauldronLevelChangeEvent",
            "EntityBlockFormEvent",
            "FluidLevelChangeEvent",
            "LeavesDecayEvent",
            "MoistureChangeEvent",
            "NotePlayEvent",
            "SignChangeEvent",
            "SpongeAbsorbEvent",
            "UnknownCommandEvent",
            "EnchantItemEvent",
            "PrepareItemEnchantEvent",
            "AreaEffectCloudApplyEvent",
            "ArrowBodyCountChangeEvent",
            "BatToggleSleepEvent",
            "CreatureSpawnEvent",
            "CreeperPowerEvent",
            "EnderDragonChangePhaseEvent",
            "EntityAirChangeEvent",
            "EntityBreakDoorEvent",
            "EntityBreedEvent",
            "EntityChangeBlockEvent",
            "EntityCombustByBlockEvent",
            "EntityCombustByEntityEvent",
            "EntityCombustEvent",
            "EntityCreatePortalEvent",
            "EntityDamageByBlockEvent",
            "EntityDamageByEntityEvent",
            "EntityDamageEvent",
            "EntityDeathEvent",
            "EntityDropItemEvent",
            "EntityEnterBlockEvent",
            "EntityEnterLoveModeEvent",
            "EntityExhaustionEvent",
            "EntityExplodeEvent",
            "EntityInteractEvent",
            "EntityPickupItemEvent",
            "EntityPlaceEvent",
            "EntityPortalEnterEvent",
            "EntityPortalEvent",
            "EntityPortalExitEvent",
            "EntityPoseChangeEvent",
            "EntityPotionEffectEvent",
            "EntityRegainHealthEvent",
            "EntityResurrectEvent",
            "EntityShootBowEvent",
            "EntitySpawnEvent",
            "EntitySpellCastEvent",
            "EntityTameEvent",
            "EntityTargetEvent",
            "EntityTargetLivingEntityEvent",
            "EntityTeleportEvent",
            "EntityToggleGlideEvent",
            "EntityToggleSwimEvent",
            "EntityTransformEvent",
            "EntityUnleashEvent",
            "ExpBottleEvent",
            "ExplosionPrimeEvent",
            "FireworkExplodeEvent",
            "FoodLevelChangeEvent",
            "HorseJumpEvent",
            "ItemDespawnEvent",
            "ItemMergeEvent",
            "ItemSpawnEvent",
            "LingeringPotionSplashEvent",
            "PiglinBarterEvent",
            "PigZapEvent",
            "PigZombieAngerEvent",
            "PlayerDeathEvent",
            "PlayerLeashEntityEvent",
            "PotionSplashEvent",
            "ProjectileHitEvent",
            "ProjectileLaunchEvent",
            "SheepDyeWoolEvent",
            "SheepRegrowWoolEvent",
            "SlimeSplitEvent",
            "SpawnerSpawnEvent",
            "StriderTemperatureChangeEvent",
            "VillagerAcquireTradeEvent",
            "VillagerCareerChangeEvent",
            "VillagerReplenishTradeEvent",
            "HangingBreakByEntityEvent",
            "HangingBreakEvent",
            "HangingPlaceEvent",
            "BrewEvent",
            "BrewingStandFuelEvent",
            "CraftItemEvent",
            "FurnaceBurnEvent",
            "FurnaceExtractEvent",
            "FurnaceSmeltEvent",
            "FurnaceStartSmeltEvent",
            "InventoryAction",
            "InventoryClickEvent",
            "InventoryCloseEvent",
            "InventoryCreativeEvent",
            "InventoryDragEvent",
            "InventoryEvent",
            "InventoryInteractEvent",
            "InventoryMoveItemEvent",
            "InventoryOpenEvent",
            "InventoryPickupItemEvent",
            "PrepareAnvilEvent",
            "PrepareItemCraftEvent",
            "PrepareSmithingEvent",
            "SmithItemEvent",
            "TradeSelectEvent",
            "AsyncPlayerChatEvent",
            "AsyncPlayerPreLoginEvent",
            "PlayerAdvancementDoneEvent",
            "PlayerAnimationEvent",
            "PlayerArmorStandManipulateEvent",
            "PlayerAttemptPickupItemEvent",
            "PlayerBedEnterEvent",
            "PlayerBedLeaveEvent",
            "PlayerBucketEmptyEvent",
            "PlayerBucketEntityEvent",
            "PlayerBucketEvent",
            "PlayerBucketFillEvent",
            "PlayerBucketFishEvent",
            "PlayerChangedMainHandEvent",
            "PlayerChangedWorldEvent",
            "PlayerChannelEvent",
            "PlayerChatEvent",
            "PlayerChatTabCompleteEvent",
            "PlayerCommandPreprocessEvent",
            "PlayerCommandSendEvent",
            "PlayerDropItemEvent",
            "PlayerEditBookEvent",
            "PlayerEggThrowEvent",
            "PlayerExpChangeEvent",
            "PlayerFishEvent",
            "PlayerGameModeChangeEvent",
            "PlayerHarvestBlockEvent",
            "PlayerInteractAtEntityEvent",
            "PlayerInteractEntityEvent",
            "PlayerInteractEvent",
            "PlayerItemBreakEvent",
            "PlayerItemConsumeEvent",
            "PlayerItemDamageEvent",
            "PlayerItemHeldEvent",
            "PlayerItemMendEvent",
            "PlayerJoinEvent",
            "PlayerKickEvent",
            "PlayerLevelChangeEvent",
            "PlayerMoveEvent",
            "PlayerPickupArrowEvent",
            "PlayerPickupItemEvent",
            "PlayerPortalEvent",
            "PlayerPreLoginEvent",
            "PlayerQuitEvent",
            "PlayerRecipeDiscoverEvent",
            "PlayerRegisterChannelEvent",
            "PlayerResourcePackStatusEvent",
            "PlayerRespawnEvent",
            "PlayerRiptideEvent",
            "PlayerShearEntityEvent",
            "PlayerStatisticIncrementEvent",
            "PlayerSwapHandItemsEvent",
            "PlayerTakeLecternBookEvent",
            "PlayerTeleportEvent",
            "PlayerToggleFlightEvent",
            "PlayerToggleSneakEvent",
            "PlayerToggleSprintEvent",
            "PlayerUnleashEntityEvent",
            "PlayerUnregisterChannelEvent",
            "PlayerVelocityEvent",
            "RaidFinishEvent",
            "RaidSpawnWaveEvent",
            "RaidStopEvent",
            "RaidTriggerEvent",
            "BroadcastMessageEvent",
            "MapInitializeEvent",
            "ServerCommandEvent",
            "ServerListPingEvent",
            "TabCompleteEvent",
            "VehicleBlockCollisionEvent",
            "VehicleCollisionEvent",
            "VehicleCreateEvent",
            "VehicleDamageEvent",
            "VehicleDestroyEvent",
            "VehicleEnterEvent",
            "VehicleEntityCollisionEvent",
            "VehicleExitEvent",
            "VehicleMoveEvent",
            "VehicleUpdateEvent",
            "LightningStrikeEvent",
            "ThunderChangeEvent",
            "WeatherChangeEvent",
            "WeatherEvent",
            "ChunkLoadEvent",
            "ChunkPopulateEvent",
            "ChunkUnloadEvent",
            "EntitiesLoadEvent",
            "EntitiesUnloadEvent",
            "GenericGameEvent",
            "LootGenerateEvent",
            "PortalCreateEvent",
            "SpawnChangeEvent",
            "StructureGrowEvent",
            "TimeSkipEvent",
            "WorldInitEvent",
            "WorldLoadEvent",
            "WorldSaveEvent",
            "WorldUnloadEvent",
    };
    
}