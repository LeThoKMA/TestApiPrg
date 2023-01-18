package com.example.testapiprg.data.model


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("code")
    var code: Int? = 0,
    @SerializedName("data")
    var `data`: Data? = Data()
)