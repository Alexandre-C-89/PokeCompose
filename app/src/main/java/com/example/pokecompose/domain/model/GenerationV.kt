package com.example.pokecompose.domain.model

import com.example.pokecompose.data.model.BlackWhite
import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)