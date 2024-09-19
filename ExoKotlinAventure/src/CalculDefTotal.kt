fun CalculDefTotal(Def:Int, TArmure:Int, Quali:Int): Int {
    val Total = ( Def + TArmure + Quali)
    return Total
}
fun main(){
    println(CalculDefTotal(3,2,1))
}