package de.philgamer.lobby.gui

import de.philgamer.lobby.utils.*
import net.axay.kspigot.extensions.bukkit.sendToServer
import net.axay.kspigot.gui.*

val gameModeGui: GUI<ForInventoryFiveByNine> = kSpigotGUI(GUIType.FIVE_BY_NINE) {
    title = "§9Spielmodi"
    defaultPage = 0

    page(0) {
        this.transitionFrom = PageChangeEffect.SLIDE_VERTICALLY
        this.transitionTo = PageChangeEffect.SLIDE_VERTICALLY

        placeholder(Slots.All, placeHolderItem)
        button(Slots.RowThreeSlotFive, spawnItem) {
            it.player.teleport(lobbySpawn)
            it.player.sendMessage("$prefix Du wurdest zum Spawn teleportiert")
        }
        button(Slots.RowThreeSlotThree, challengeItem) {
            if (it.bukkitEvent.isLeftClick) {
                it.player.teleport(challenges)

            } else {
                it.guiInstance.gotoPage(-1)
            }
        }
    }
    page(-1) {
        this.transitionFrom = PageChangeEffect.SLIDE_HORIZONTALLY
        this.transitionTo = PageChangeEffect.SLIDE_HORIZONTALLY

        placeholder(Slots.All, placeHolderItem)

        button(Slots.RowFiveSlotOne, challengeServerItem) {
            it.player.sendToServer("challenge-1")
        }

    }
}
