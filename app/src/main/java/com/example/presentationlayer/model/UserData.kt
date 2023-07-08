package com.example.presentationlayer.model

data class UserData(
    val name:String,
    val email:String,
    val password:String,
    val weight:Double,
    val height:Int,
    val age:Int,
    val activationRate:Double,
    val gender:String,
    val firebaseToken:String
)
