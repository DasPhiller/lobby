package de.philgamer.lobby.commands

import de.philgamer.lobby.utils.prefix
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class FlyCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) return true
        val player: Player = sender
        if (player.hasPermission("lobby.command.fly")) {
            if (player.isFlying) {
                player.allowFlight = false
                player.sendMessage("$prefix Du kannst nun nicht mehr fliegen")
            } else {
                player.allowFlight = true
                player.sendMessage("$prefix Du kannst nun fliegen")
            }
        } else {
            player.sendMessage("$prefix Dazu hast du keine Rechte!")
        }
        return true
    }
}