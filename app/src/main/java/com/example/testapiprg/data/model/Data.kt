package com.example.testapiprg.data.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("address")
    var address: String? = "",
    @SerializedName("createdAt")
    var createdAt: String? = "",
    @SerializedName("email")
    var email: String? = "",
    @SerializedName("fullName")
    var fullName: String? = "",
    @SerializedName("phone")
    var phone: String? = "",
    @SerializedName("role")
    var role: String? = "",
    @SerializedName("token")
    var token: String? = "",
    @SerializedName("updatedAt")
    var updatedAt: String? = "",
    @SerializedName("userId")
    var userId: String? = ""
)