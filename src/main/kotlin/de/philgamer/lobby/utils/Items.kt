package de.philgamer.lobby.utils

import net.axay.kspigot.items.itemStack
import net.axay.kspigot.items.meta
import net.axay.kspigot.items.*
import net.kyori.adventure.text.Component
import org.bukkit.Material

val compass = itemStack(Material.COMPASS) {
    meta {
        name = "§9Spielmodi"
        lore(listOf(Component.text("§9Teleportiere dich zu den Spielmodi")))
    }
}

val placeHolderItem = itemStack(Material.GRAY_STAINED_GLASS_PANE) {
    meta {
        name = " "
    }
}

val spawnItem = itemStack(Material.NETHER_STAR) {
    meta {
        name = "§9Spawn "
    }
}

val challengeItem = itemStack(Material.DRAGON_HEAD) {
    meta {
        name = "§9Challenges"
    }


}

val challengeServerItem = itemStack(Material.DRAGON_HEAD) {
    meta {
        name = "§9Challenge-1"
    }
}

val skyWarsItem = itemStack(Material.GRASS_BLOCK) {
    meta {
        name = "§9Skywars"
    }
}