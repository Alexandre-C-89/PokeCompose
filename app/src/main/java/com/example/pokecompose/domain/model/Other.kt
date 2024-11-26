package com.example.pokecompose.data.model

import com.example.pokecompose.domain.model.DreamWorld
import com.example.pokecompose.domain.model.OfficialArtwork
import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork
)