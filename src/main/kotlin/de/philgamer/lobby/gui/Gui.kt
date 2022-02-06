package de.philgamer.lobby.gui

import de.philgamer.lobby.utils.*
import net.axay.kspigot.gui.*
import org.bukkit.Location
import org.bukkit.Sound
import org.bukkit.entity.Player

val gameModeGui: GUI<ForInventoryFiveByNine> = kSpigotGUI(GUIType.FIVE_BY_NINE) {
    title = "§9Spielmodi"
    defaultPage = 0

    page(0) {
        this.transitionFrom = PageChangeEffect.SLIDE_VERTICALLY
        this.transitionTo = PageChangeEffect.SLIDE_VERTICALLY

        placeholder(Slots.All, placeHolderItem)
        button(Slots.RowThreeSlotFive, spawnItem) {
            it.player.teleport(lobbySpawn)
            teleportPlayerToGameMode(it.player, lobbySpawn, "Spawn")
        }
        button(Slots.RowThreeSlotThree, challengeItem) {
            it.player.teleport(challenges)
            teleportPlayerToGameMode(it.player, challenges, "Challenges")
        }
        button(Slots.RowThreeSlotSeven, skyWarsItem) {
            it.player.teleport(skyWars)
            teleportPlayerToGameMode(it.player, skyWars, "Skywars")
        }
    }
}

fun teleportPlayerToGameMode(player: Player, gamemode: Location, name: String) {
    player.teleport(gamemode)
    player.sendMessage("$prefix Du wurdest zu $name teleportiert")
    player.playSound(player.location, Sound.ENTITY_ENDERMAN_TELEPORT, 1F, 1F)
}
