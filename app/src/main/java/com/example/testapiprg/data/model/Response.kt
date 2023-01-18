package com.example.testapiprg.data.model


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("message")
    var message: String? = "",
    @SerializedName("status")
    var status: String? = ""
)