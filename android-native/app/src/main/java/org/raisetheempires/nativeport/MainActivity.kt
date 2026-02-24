package org.raisetheempires.nativeport

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.raisetheempires.nativeport.data.IslandRepository
import org.raisetheempires.nativeport.ui.IslandScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = IslandRepository(this)
        val objects = repository.loadInitialIsland()

        setContent {
            IslandScreen(objects)
        }
    }
}
