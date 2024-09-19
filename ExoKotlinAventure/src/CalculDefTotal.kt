fun calculDefTotal(Def:Int, TArmure:Int, Quali:Int): Int {
    val Total = ( Def + TArmure + Quali)
    return Total
}
fun main(){
    println(calculDefTotal(3,2,1))
}