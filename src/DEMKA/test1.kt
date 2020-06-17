import junit.framework.Assert.assertEquals
import org.junit.Test
import kotlin.math.pow
import  kotlin.math.sqrt

/*
Функция для нахождения корней через дискриминант
 */
fun desc(a: Int, b: Int, c: Int) : Double
{
    //ax^2+bx+c=0
    val D = b.toDouble().pow(2) - 4 * a * c
    val x1 = (-b + sqrt(D))/(2*a)
    val x2 = (-b - sqrt(D))/(2*a)

    println("D = $D")
    println("x1 = $x1")
    println("x2 = $x2")
    return x2

}

@Test
fun main() {
    assertEquals(-5.0, desc(3,13, -10))
    //b^
    val result = desc(3,13, -10)
    print("Результат вычислений:")
    print(result)
}
