import kotlin.math.pow

//Função divisão
fun div(n1: Float?, n2: Float?) = n1!!.div(n2!!)

//Função multiplicaão
fun multi(n1: Float?, n2: Float?) = n1!!.times(n2!!)

//Função subtração
fun minus(n1: Float?, n2: Float?) = n1!!.minus(n2!!)

//Função soma
fun sum(n1: Float?, n2: Float?) = n1!!.plus(n2!!)

//Função Porcentagem
fun porcent(n1: Float?, n2: Float?) = n1!!.times(n2!!) / 100

//Função Pontenciação
fun power(n1: Float?, n2: Float?) = n1!!.toDouble().pow(n2!!.toDouble())

//Validando os números
fun Float?.isNullOrEmpty(): Boolean {
    return true
}

fun main()
{
    println("--------------------------------------------------")
    println("               CALCULADORA                        ")
    println("--------------------------------------------------")

    println("Digite o primeiro número para calcular")
    val number1 = readLine()?.toFloat()

    println("Digite o segundo número para calcular")
    val number2 = readLine()?.toFloat()

    if (number1.isNullOrEmpty() || number2.isNullOrEmpty())
    {
        println("Número inválido")
    }
    else

    println("Escolha o tipo da operação")
    println("1: / Divisão")
    println("2: * Multiplicação")
    println("3: - Subtração")
    println("4: + Soma")
    println("5: % Porcentagem")
    println("6: ^ Potencição")

    when (readLine()!!.toInt())
    {
        1 ->
        {
            val divider = div(number1, number2)
            println("O resultado da Divisão dos $number1 e $number2 é = $divider")
        }
        2 ->
        {
            val multiply = multi(number1, number2)
            println("O resultado da Multiplicação dos $number1 e $number2 é = $multiply")
        }
        3 ->
        {
            val sub = minus(number1, number2)
            println("O resultado da Subtração dos $number1 e $number2 é = $sub")
        }
        4 ->
        {
            val add = sum(number1, number2)
            println("O resultado da Soma dos $number1 e $number2 é = $add")
        }
        5 ->
        {
            val porcent = porcent(number1, number2)
            println("O resultado da Porcentagem dos $number1 e $number2 é = $porcent")
        }
        6 ->
        {
            val pow = power(number1, number2)
            println("O resultado da Potenciação dos $number1 e $number2 é = $pow")
        }
        else -> {
            println("--------------------------------------------------")
            println("Operação inválida")
            println("--------------------------------------------------")
        }
    }
}
