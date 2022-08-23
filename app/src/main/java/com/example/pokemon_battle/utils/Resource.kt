package com.example.pokemon_battle.utils

sealed class Resource<T>(data: T? = null, message: String? = null){
    data class Success<T>(val data: T): Resource<T>(data)
    class Loading<T>(): Resource<T>()
    data class Error<T>(val message: String): Resource<T>(null, message)
}
