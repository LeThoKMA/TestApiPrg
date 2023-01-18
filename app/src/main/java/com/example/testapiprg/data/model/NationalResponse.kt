package com.example.testapiprg.data.model


import com.google.gson.annotations.SerializedName

data class NationalResponse(
    @SerializedName("country")
    var country: List<Country?>? = listOf(),
    @SerializedName("name")
    var name: String? = ""
)