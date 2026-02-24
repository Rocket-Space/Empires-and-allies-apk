package org.raisetheempires.nativeport.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.raisetheempires.nativeport.data.GridObject

@Composable
fun IslandScreen(objects: List<GridObject>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF10212B))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Empires & Allies Native - Isla inicial",
            style = MaterialTheme.typography.titleLarge,
            color = Color(0xFFF3F7FA)
        )
        Text(
            text = "Objetos cargados: ${objects.size}",
            color = Color(0xFFB7D5E8)
        )

        LazyColumn(verticalArrangement = Arrangement.spacedBy(6.dp)) {
            items(objects.take(150)) { obj ->
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(text = "#${obj.id}", color = Color(0xFF9AC5FF))
                    Text(text = obj.itemName, color = Color(0xFFE8F0F5))
                    Text(text = "(${obj.x}, ${obj.y}, ${obj.z})", color = Color(0xFF7FBCA4))
                }
            }
        }
    }
}
