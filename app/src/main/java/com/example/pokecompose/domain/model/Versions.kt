package com.example.pokecompose.data.model

import com.example.pokecompose.domain.model.GenerationI
import com.example.pokecompose.domain.model.GenerationV
import com.example.pokecompose.domain.model.GenerationVi
import com.example.pokecompose.domain.model.GenerationVii
import com.example.pokecompose.domain.model.GenerationViii
import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i")
    val generationI: GenerationI,
    @SerializedName("generation-ii")
    val generationIi: GenerationIi,
    @SerializedName("generation-iii")
    val generationIii: GenerationIii,
    @SerializedName("generation-iv")
    val generationIv: GenerationIv,
    @SerializedName("generation-v")
    val generationV: GenerationV,
    @SerializedName("generation-vi")
    val generationVi: GenerationVi,
    @SerializedName("generation-vii")
    val generationVii: GenerationVii,
    @SerializedName("generation-viii")
    val generationViii: GenerationViii
)