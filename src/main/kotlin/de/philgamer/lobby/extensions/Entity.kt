package de.philgamer.lobby.extensions

import org.bukkit.entity.LivingEntity

fun LivingEntity.killEntity() {
    health = 0.0
}