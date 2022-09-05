package net.doiche.hud.tasks

import net.doiche.hud.HUD
import net.doiche.hud.hudMap
import java.util.UUID

object UserManager {
    private val userMap = HashMap<UUID,Int>()

    fun getId(uuid: UUID) = userMap[uuid]
    fun inputId(uuid: UUID,id: Int) { userMap[uuid] = id }

    fun input(uuid: UUID) {
        val hud = HUD(database.getDouble("stamina"),database.getDouble("stamina"),database.getDouble("stamina"))
        HUDManager.input(uuid,hud)
        userMap[uuid] = id
    }
}