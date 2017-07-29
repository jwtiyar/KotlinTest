fun main(args: Array<String>) {

    //boolean bas dw nrxy haya false yan true lawa zyatr nya
    println(3>2)
    println(3<2)
    // false ya3ny 0 w true ya3ny 1 , le AND operation har kate false y lagall bw anjam dakata false.
    // ballam la OR operayion awanay true y lagalla dabeta true tanha false w false abeta false .
    println(10>12 && 2>3) // hemay AND amaya &&
    println(10>9 && 3>2)

    var n=10
    println(n>=1 && n<=100)
    println(n>=11 && n<=100)
    println(n>=11 && n<=9)

    // hemay OR amaya || .

    println(3>2 || 3>1)
    println(n>=11 || n<=9)

    var chakyn=false
    println(chakyn)
    var chakyn1=false
    println(!chakyn) // lera hemay sarswrrmanman krda peshy gorrawekae bo away anjamak nafy bkat boya false aka ba true  wata 3aksy akatawa.
    // atwany hardw logic aka tekall kay bam shewaya :
    var jmare=10
    println((jmare>=1 && jmare<=100) ||
            (jmare>=11 && jmare<=100)
    )
}