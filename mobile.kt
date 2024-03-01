interface Mobile{
    fun info(){}
    fun output(){}
}

abstract class HHH():Mobile{
    abstract var name: String
    abstract var description: String
    abstract var cost:Double
    abstract var coating:Double
    abstract var bo:Boolean
    open fun rate():Double{
        return 0.0
    }
    override fun info(){}

}


