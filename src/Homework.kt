fun main() {
    // Задание 1. Проверка уровня доступа игрока

    print("Введите свой уровень: ")
    val lvl = readln().toInt()
    if (lvl < 10)
        println("Новичок! Вы получите +10 HP")
    else if (lvl <= 50)
        println("Опытный! Вы получите +30 HP")
    else
        println("Легенда! Вы получите +100 HP")

    // Задание 2. Проверка возраста

    print("Введите ваш возраст: ")
    val age = readln().toInt()
    if (age < 12)
        println("Вы ребенок")
    else if (age <= 17)
        println("Вы подросток")
    else
        println("Вы взрослый")

    // Задание 3. Проверка диапазона

    print("Введите число от 1 до 100: ")
    val num = readln().toInt()
    if (num in 10..50)
        println("Число $num входит в диапозон от 10 до 50")
    else
        println("Число $num не входит в диапозон от 10 до 50")

    // Задание 4. Распознавание символа

    print("Введите символ: ")
    val char = readln().first()
    if (char in '0'..'9')
        println("Это цифра")
    else if (char.lowercaseChar() in 'a'..'z')
        println("Это буква латинского алфавита")
    else if (char == ' ')
        println("Это пробел")
    else
        println("Это спецсимвол")

    // Задание 5. Таблица умножения

    var x = 1
    repeat(10){
        println("5 * ${x} = ${5 * x++}")
    }

    // Задание 6. Коллекция любимых фильмов

    val movie = listOf("Пила", "Гарри Потер", "Пятница, 13-е", "Dexter", "Во все тяжкие")
    for (i in movie)
        println("$i (кол-во символов - ${i.length})")

    // Задание 7. Создайте программу-миниопрос

    print("Введите ваше имя: ")
    val name = readln()
    print("Введите свой возраст: ")
    val age1 = readln().toInt()
    print("Введите свой любимый цвет: ")
    val color = readln()
    println("Привет $name! Тебе $age1 лет, и ты любишь $color")

}