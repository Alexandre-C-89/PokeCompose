package com.example.pokecompose.domain.model

import com.example.pokecompose.data.model.VersionGroupDetail
import com.google.gson.annotations.SerializedName

data class Move(
    val move: MoveX,
    @SerializedName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>
)