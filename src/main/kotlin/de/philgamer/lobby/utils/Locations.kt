package de.philgamer.lobby.utils

import de.philgamer.lobby.extensions.location
import de.philgamer.lobby.extensions.locationWithDouble
import org.bukkit.Bukkit
import org.bukkit.Location

val lobbySpawn = location("world", 8, 2, 8)
val challenges = Location(Bukkit.getWorld("world"), 8.60 ,-10.00 ,29.52, 178.20F, 6.66F)
val skyWars = locationWithDouble("world", 12.47, -8.00, 31.33)