import kotlin.random.Random
fun LanceDes(nbDes:Int, valDes:Int) :Int {
    var somme = 0
    for (item in 1..nbDes) {
        val resultat = Random.nextInt(1, valDes + 1)
        somme += resultat
    }
    return somme
}
fun main(){
    println(LanceDes(4,20))
}
