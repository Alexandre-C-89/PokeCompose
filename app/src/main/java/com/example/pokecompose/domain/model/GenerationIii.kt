package com.example.pokecompose.data.model

import com.example.pokecompose.domain.model.Emerald
import com.example.pokecompose.domain.model.FireredLeafgreen
import com.example.pokecompose.domain.model.RubySapphire
import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreen,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphire
)