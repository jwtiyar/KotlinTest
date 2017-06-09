/**
 * Created by jwtiyar on 07/06/17.
 */
/* eme yasakany byrkarye bo krdary byrkary
1.()
2. ++ / -- ( le pesh variable bn eman encam dedren )
2. ^
3. / , *
4. + , -
5. =
6. ++ / -- ( le dway variable we bet ewa kota sht krdareke encamy dedat )
 */
fun main(args:Array<String>) {

    var x = 5
    var y = 5
    var z = (++x+y) * y /* (++x= x=x+1) we (--x=)=(x=x-1) be maney eweye */
    println("z:$z")

    var g=(x+++y) *y /* heman encamy sereweye chwnke () bekar henrawe bellam eger laydey heman encam
     nye chwnke servar g=(x+++y) *y eta lekdan encam dedat wek nmwney xwarewe */
    println("g:$g")

    var f=x+++y *y
    println("f:$f")
}
