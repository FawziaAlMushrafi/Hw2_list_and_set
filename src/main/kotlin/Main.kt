fun main(args: Array<String>) {
    var Citys= mutableListOf("  RIYADH " , "Alofuf" , " UMLAJ")
    println(Citys)

    Citys.addAll(0 , listOf("ALMADINAH","ABHA"))
    println(Citys)
    Citys[3]="ALHOFUF"
    println(Citys)
for(index in 0 until  Citys.size){
    println("$index-${Citys[index]}")

}
}