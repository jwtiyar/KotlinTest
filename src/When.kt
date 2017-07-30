fun main(args: Array<String>) {
    //When w IFelse teqryben wek yek wan bellam when asan tre bo range dyarykrdn.
    print("---- bnws 7ayatm ----")
    val tandrwstyt: Int = readLine()!!.toInt()


    when (tandrwstyt) {
        1 -> {
            println("1")
        }
        2 -> {
            println("2")
        }
        in 2..4 -> {
            println("le nawyaty")
        }
        !in 2..4 -> {
            println("tyay nye")
        }
        else-> {
            println("chaky")
        }
    }
}