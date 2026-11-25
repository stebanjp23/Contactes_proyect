package cat.institut.dam.contactes

import org.json.JSONObject
import kotlin.String

data class Contacte(
    val id: Int,
    val nom: String,
    val username: String,
    val email: String,
    val telefon: String,
    val web: String,
    val carrer: String,
    val ciutat: String,
    val codiPostal: String,
    val latitud: Double,
    val longitud: Double

){
    val inicials : String
        get() = nom.split(" ").take(2).joinToString (""){ it.first().uppercase() }

    //(" "): separa el nombre por espacios.
    //take(2): coge las dos primeras palabras.
    //joinToString(""): une el resultado sin espacios.
    //first().uppercase(): obtiene la primera letra y la convierte en mayúscula.

    val adreçaCompleta: String
        get() = "$carrer,$ciutat,$codiPostal"

    //Usamos el get() para obtener los valores y concatenarlos para almacenarlos en la variable adreça

    val urlAvatar: String
        get() = "https://i.pravatar.cc/300?u=$username"
    //Usamos el get() para obtener el nombre de usuario y concatenarlo con la URL

    companion object {
        fun desDeJson(json: JSONObject): Contacte {
            val adreça = json.getJSONObject("address")
            val geo = adreça.getJSONObject("geo")
            return Contacte(
                id = json.getInt("id"),
                nom = json.getString("name"),
                username = json.getString("username"),
                email = json.getString("email"),
                telefon = json.getString("phone"),
                web = json.getString("website"),
                carrer = adreça.getString("street"),
                ciutat = adreça.getString("city"),
                codiPostal = adreça.getString("zipcode"),
                latitud = geo.getDouble("lat"),
                longitud = geo.getDouble("lng")
            )
        }
    }


}
