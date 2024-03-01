class Megafon():HHH() {
    override var bo=true
    override var name=""
    override var description=""
    override var coating=0.0
    override var cost=0.0
    override fun info() {
        try{
            var x:Double
            println("name")
            name= readln()
            println("coating")
            x= readln()!!.toDouble()
            if(x>0){
                coating= x
                println("cost")
                x= readln()!!.toDouble()
                if(x>0){
                    cost= x
                    println("description")
                    description= readln()!!.toString()
                    bo=true
                }
                else{
                    println("no")
                    bo=false
                }
            }
            else{
                println("no")
                bo=false
            }

        }catch (e:Exception){
            println("no")
        }
    }



    override fun rate():Double {
       return (100.0*coating/cost)
    }
    override fun output() {
        if(bo==true){
            println("name $name")
            println("description $description")
            println("coating $coating")
            println("cost $cost")
            println("rate ${rate()}")
        }
    }
}