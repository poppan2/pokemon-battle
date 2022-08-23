package com.example.pokemon_battle.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.pokemon_battle.presentation.screens.destinations.BattleSystemScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator
){
    Column {
        Text(text = "Hello Name")
        Button(onClick = {
            navigator.navigate(BattleSystemScreenDestination)
        }) {
            Text(text = "Go To Next Page")
        }
    }

}