package org.raisetheempires.nativeport.data

import android.content.Context
import kotlinx.serialization.json.Json

class IslandRepository(private val context: Context) {
    private val json = Json {
        ignoreUnknownKeys = true
    }

    fun loadInitialIsland(): List<GridObject> {
        val raw = context.assets.open("initial-island.json").bufferedReader().use { it.readText() }
        val data = json.decodeFromString<IslandData>(raw)
        return data.objects.mapNotNull { obj ->
            val parts = obj.position.split(",")
            if (parts.size != 3) {
                null
            } else {
                GridObject(
                    id = obj.id,
                    itemName = obj.itemName,
                    x = parts[0].trim().toIntOrNull() ?: return@mapNotNull null,
                    y = parts[1].trim().toIntOrNull() ?: return@mapNotNull null,
                    z = parts[2].trim().toIntOrNull() ?: 0
                )
            }
        }
    }
}
