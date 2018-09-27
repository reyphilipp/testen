class Calculator :ICalculator{
    override fun add(value1:Double, value2:Double):Double{
        return value1.plus(value2)
    }

    fun sub(value1:Double, value2:Double):Double{
        return value1.minus(value2)
    }
}