package com.example.pokemon_battle.domain.repository

import com.example.pokemon_battle.domain.models.Pokemon
import com.example.pokemon_battle.utils.Resource

interface PokemonRepo {
    suspend fun getPokemonById(pokeId: Int) : Resource<Pokemon>
}