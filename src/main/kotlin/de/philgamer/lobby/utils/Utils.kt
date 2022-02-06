package de.philgamer.lobby.utils

import net.axay.kspigot.chat.KColors
import org.bukkit.Bukkit
import org.bukkit.entity.EntityType
import org.bukkit.entity.Villager

val prefix = "${KColors.GRAY}[${KColors.BLUE}Lobby${KColors.GRAY}]"
val lobbyWorld = Bukkit.getWorld("world")
val villager = challengesVillager.world.spawnEntity(challengesVillager, EntityType.VILLAGER) as Villager

fun challengeNPC() {
    val loc = challengesVillager
    villager

}