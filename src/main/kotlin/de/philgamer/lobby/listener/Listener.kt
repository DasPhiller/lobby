package de.philgamer.lobby.listener

import de.philgamer.lobby.extensions.location
import de.philgamer.lobby.gui.gameModeGui
import de.philgamer.lobby.utils.*
import io.papermc.paper.event.entity.EntityMoveEvent
import net.axay.kspigot.event.listen
import net.axay.kspigot.gui.openGUI
import net.kyori.adventure.text.Component
import org.bukkit.GameMode
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.entity.FoodLevelChangeEvent
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.*

val join = listen<PlayerJoinEvent> {
    it.player.teleport(lobbySpawn)
    it.player.inventory.setItem(4, compass)
    it.joinMessage(null)
    it.player.sendTitle("§9Willkommen auf", "§e16nergames.at")
}
val quit = listen<PlayerQuitEvent> {
    it.quitMessage(null)
}
val interact = listen<PlayerInteractEvent> {
    if (it.item == compass) {
        it.player.openGUI(gameModeGui)
    }
}

val move = listen<EntityMoveEvent> {
    if (it.entityType == EntityType.VILLAGER) {
        it.isCancelled = true

    }
}

val drop = listen<PlayerDropItemEvent> {
    if (it.player.gameMode == GameMode.SURVIVAL) {
        it.isCancelled = true
    }
}

val breakEvent = listen<BlockBreakEvent> {
    if (it.player.gameMode == GameMode.SURVIVAL) {
        it.isCancelled = true
    }
}

val click = listen<InventoryClickEvent> {
    if (it.whoClicked !is Player) return@listen
    val player: Player = it.whoClicked as Player
    if (player.gameMode == GameMode.SURVIVAL) {
        it.isCancelled = true
    }
}

val damage = listen<EntityDamageEvent> {
    if (it.entity !is Player) return@listen
    it.isCancelled = true
}

val food = listen<FoodLevelChangeEvent> {
    if (it.entity !is Player) return@listen
    it.isCancelled = true
}