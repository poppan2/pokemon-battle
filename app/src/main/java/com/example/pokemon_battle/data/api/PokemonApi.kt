package com.example.pokemon_battle.data.api

import com.example.pokemon_battle.domain.models.Pokemon
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {
    @GET("pokemon/{pokeId}")
    suspend fun getPokemonById(
        @Path("pokeId") pokeId: Int
    ): Response<Pokemon>
}