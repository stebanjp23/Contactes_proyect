package cat.institut.dam.contactes

import android.graphics.Bitmap
import android.net.Uri

object ContactesRepository {

    private val contactes = mutableListOf<Contacte>()
    private val favorits = mutableSetOf<Int>()
    private val fotos = mutableMapOf<Int, Uri>()

    val llista: List<Contacte>
        get() = contactes

    fun buscar_contacte(id:Int): Contacte?{
        return contactes.firstOrNull {it.id == id}
    }

    fun actualitza(novs: List<Contacte>) {
        contactes.clear() //Limpia la lista
        contactes.addAll(novs) // carga los contactos
    }

    fun esFavorit(id: Int): Boolean{
        return favorits.contains(id)
    }

    fun lternaFavorit(id: Int){
        if (esFavorit(id)){
            favorits.remove(id)
        }else{
            favorits.add(id)
        }
    }

    fun cerca(text: String): List<Contacte>{
        return contactes.filter {contacte -> contacte.nom.contains(text, ignoreCase = true) ||
                contacte.ciutat.contains(text, ignoreCase = true) ||
                contacte.email.contains(text, ignoreCase = true)}
    }

    fun foto(id:Int): Uri?{ //Recupera la foto asociada al usuario
        return fotos.get(id)
    }

    fun desaFoto(id: Int, uri: Uri){ //Guarda la foto en la lista <clave, valor>
        fotos.set(id,uri)
    }


}