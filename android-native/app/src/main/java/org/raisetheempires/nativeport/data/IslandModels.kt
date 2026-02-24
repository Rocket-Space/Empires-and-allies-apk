package org.raisetheempires.nativeport.data

import kotlinx.serialization.Serializable

@Serializable
data class IslandObject(
    val id: Long,
    val itemName: String,
    val position: String,
    val referenceItem: String? = null
)

@Serializable
data class IslandData(
    val objects: List<IslandObject> = emptyList()
)

data class GridObject(
    val id: Long,
    val itemName: String,
    val x: Int,
    val y: Int,
    val z: Int
)
