import LanceDes
fun calculDegatArme(bquali:Int, scritique:Int, mltpcrt:Int ) :Int {
    var resultat = LanceDes(1, 6)
    if (resultat >= scritique) {
        resultat *= mltpcrt
    }
    resultat += bquali
    return resultat
}
fun main(){
    println(calculDegatArme(2, 6, 2))

}
