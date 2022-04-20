package ru.netology

fun main (){


    print("Введите сумму которую Вы хотите перевести: ")
    val amount :Float  = readLine()!!.toFloat()
    val percent = 0.75
    val calculation = amount * 0.75 / 100
        val commission = if (calculation < 35) {
            print("Ваша комиссия при переводе $amount рублей составит  35 рублей")}
        else print ("Ваша коммиссия при переводе $amount рублей составит $calculation рублей")
}
//