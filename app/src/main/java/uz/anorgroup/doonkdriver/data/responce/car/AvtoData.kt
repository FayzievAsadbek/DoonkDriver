package uz.anorgroup.doonkdriver.data.responce.car


import com.google.gson.annotations.SerializedName

data class AvtoData(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)