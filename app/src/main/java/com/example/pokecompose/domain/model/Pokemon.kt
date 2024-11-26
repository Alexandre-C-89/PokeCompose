package com.example.pokecompose.data.model


import com.example.pokecompose.domain.model.Ability
import com.example.pokecompose.domain.model.Form
import com.example.pokecompose.domain.model.GameIndice
import com.example.pokecompose.domain.model.Move
import com.example.pokecompose.domain.model.Species
import com.example.pokecompose.domain.model.Sprites
import com.example.pokecompose.domain.model.Stat
import com.example.pokecompose.domain.model.Type
import com.google.gson.annotations.SerializedName

data class Pokemon(
    val abilities: List<Ability>,
    @SerializedName("base_experience")
    val baseExperience: Int,
    val forms: List<Form>,
    @SerializedName("game_indices")
    val gameIndices: List<GameIndice>,
    val height: Int,
    @SerializedName("held_items")
    val heldItems: List<Any>,
    val id: Int,
    @SerializedName("is_default")
    val isDefault: Boolean,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Int,
    @SerializedName("past_types")
    val pastTypes: List<Any>,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int
)