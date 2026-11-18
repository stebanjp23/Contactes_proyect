package cat.institut.dam.contactes

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



)