package de.philgamer.lobby

import de.philgamer.lobby.listener.*
import de.philgamer.lobby.utils.challengeNPC
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.event.register
import net.axay.kspigot.main.KSpigot

class Main : KSpigot() {

    override fun startup() {
        logger.info("${KColors.GREEN}The Plugin was enabled!")
        join.register()
        quit.register()
        interact.register()
        move.register()
        interactEntity.register()
        drop.register()
        breakEvent.register()
        interact.register()
        spawnNPCs()
    }

    override fun shutdown() {
        logger.info("${KColors.RED}The Plugin was disabled!")
    }
    private fun spawnNPCs() {
        challengeNPC()
    }
}
