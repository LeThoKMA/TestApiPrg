package com.example.testapiprg.data.model


import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("address")
    var address: String? = "",
    @SerializedName("email")
    var email: String? = "",
    @SerializedName("fullName")
    var fullName: String? = "",
    @SerializedName("password")
    var password: String? = "",
    @SerializedName("phone")
    var phone: String? = ""
)