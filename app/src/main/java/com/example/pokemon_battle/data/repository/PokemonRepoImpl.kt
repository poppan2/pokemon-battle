package com.example.pokemon_battle.data.repository

import com.example.pokemon_battle.data.api.PokemonApi
import com.example.pokemon_battle.domain.models.Pokemon
import com.example.pokemon_battle.domain.repository.PokemonRepo
import com.example.pokemon_battle.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.Exception

class PokemonRepoImpl(
   private val api: PokemonApi
): PokemonRepo {
    override suspend fun getPokemonById(pokeId: Int): Resource<Pokemon> = withContext(Dispatchers.IO){
        val res = api.getPokemonById(pokeId)
        return@withContext try {
            if(res.isSuccessful){
                Resource.Success(res.body()!!)
            }else {
                Resource.Error("Something went wrong")
            }
        }catch (e: Exception){
            Resource.Error(e.localizedMessage!!.toString())
        }
    }
}