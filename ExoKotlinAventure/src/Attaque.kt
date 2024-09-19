fun Attaque(pv: Double, nattaquant : String, ncible : String){
    var resultat = calculDegatArme(2, 6, 2) - calculDefTotal(3,2,1)
    if (resultat < 0){
        resultat = 0
    }else {
        resultat = resultat
    }
    var pvrestant = pv - resultat
    println("$nattaquant attaque $ncible et lui inflige $resultat points de dégats ! ($pvrestant pv restants)")
}
fun main(){
    println(Attaque(15.0,"Attaquant", "Cible"))
}