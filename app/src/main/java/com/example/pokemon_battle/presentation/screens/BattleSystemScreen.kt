package com.example.pokemon_battle.presentation.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination
fun BattleSystemScreen(){
    Text(text = "Welcome to BattleSystem Screen")
}