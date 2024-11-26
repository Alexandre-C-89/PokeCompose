package com.example.pokecompose.data.model

import com.example.pokecompose.domain.model.DiamondPearl
import com.example.pokecompose.domain.model.HeartgoldSoulsilver
import com.example.pokecompose.domain.model.Platinum
import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearl,
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)