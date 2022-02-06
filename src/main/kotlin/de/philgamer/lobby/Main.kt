package de.philgamer.lobby

import de.philgamer.lobby.commands.FlyCommand
import de.philgamer.lobby.listener.*
import de.philgamer.lobby.utils.prefix
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.event.register
import net.axay.kspigot.main.KSpigot
import org.bukkit.Bukkit

class Main : KSpigot() {

    override fun startup() {

        logger.info("${KColors.GREEN}The Plugin was enabled!")
        Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord")
        logger.info("$prefix Activating Listener")
        join.register()
        quit.register()
        interact.register()
        move.register()
        drop.register()
        breakEvent.register()
        interact.register()
        damage.register()
        food.register()
        getCommand("fly")?.setExecutor(FlyCommand())
        logger.info("$prefix Spawning NPCs")
    }

    override fun shutdown() {
        logger.info("${KColors.RED}The Plugin was disabled!")
    }

}
