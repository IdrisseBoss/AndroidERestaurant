package fr.isen.idrisse.androiderestaurant.network

import com.google.gson.annotations.SerializedName
import java.io.Serializable



class MenuResult(@SerializedName("data") val data: List<Category>) : Serializable {

}