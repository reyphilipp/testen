class Finance(val calc:ICalculator){
    fun betragCalc():Double{
        val resultat = calc.add(44.0,66.0)
        if (resultat == 8.0){
            println("Resulatat = 8")
        }else{
            println("nicht 8")
        }
        return resultat
    }
}