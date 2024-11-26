package com.example.pokecompose.data.remote

import com.example.pokecompose.domain.PokemonList
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon")
    suspend fun getPokemonList(@Query("limit") limit: Int, @Query("offset") offset: Int): PokemonList
}