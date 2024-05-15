import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule


fun main() {
    val firstCar = Car(model = "VAZ", year = 2023, color = Color.valueOf("RED"), luxVersion = true)
    val secondCar = Car(model = "VAZ", year = 2023, color = Color.YELLOW)

    //сериализация
    val mapper = ObjectMapper().registerModules(KotlinModule())
    val carJson1 = mapper.writeValueAsString(firstCar)
    val carJson3 = mapper.writeValueAsString(secondCar)
    println(carJson3)


    //десериализация
    val carJson2 = """{
    "model" : "VAZ",
        "year" : "2023",
            "color" : "RED",
                "luxVersion" : true
} """
//val carFromJson: Car = mapper.readValue(content = carJson2, valueType = Car::class.java)

    println(firstCar.isCarsSimilar(secondCar))
    println(firstCar.isCarsTheSame(secondCar))
    println(secondCar.hashCode())
    println(firstCar.hashCode())

    val p1 = Point(x = 0.0f, y = 3.0f)
    val p2 = Point(x = 4.0f, y = 0.0f)
    val rectangle = Rectangle(p1, p2)
    val circle = Circle(radius = 3.0f)

    println("Distance = " + p1.distance(p2))
    println("Square of rectangle = " + rectangle.calculateShapeSquare())
    println("Perimetr of rectangle = " + rectangle.calculateShapePerimeter())

    println("Square of circle = " + circle.calculateShapeSquare())
    println("Perimeter of circle = " + circle.calculateShapePerimeter())

    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35),
        Person("Alice", 30),
        Person("Alice", 30),
        Person("Eve", 40),
        Person("Bob", 25),
        Person("Bob", 25)
    )

//    val duplicatesPerson = people.groupingBy { person -> person }
//        .eachCount()

//    val maxCountOfDuplicatesPerson = duplicatesPerson.maxOfOrNull { it.value }
//    val theMostDuplicatesPerson = duplicatesPerson.filterValues { it == maxCountOfDuplicatesPerson }.keys
//    println(theMostDuplicatesPerson.forEach { it -> println(it.name + " " + it.age) })
    val duplicatesPerson = people.groupingBy { it }
        .eachCount()
        .maxByOrNull { it.value }
        ?.key
    println(duplicatesPerson)


    val listOfStrings = listOf("abc", "aBC", "AAA", "azx", "brt", "Brt", "date", "Zza")
    val resultMap = listOfStrings.groupBy({ it.first().lowercase() }, { it })
    println(resultMap)


//есть List<Int> - проверить все ли элементы в списке больше 10
    val listOfNumbers = mutableListOf(10, 10)
    var sumOfListNumbers = 0
    for (i in listOfNumbers) {
        sumOfListNumbers += i
    }
    if (sumOfListNumbers / 10 >= listOfNumbers.size) {
        println("Все элементы больше 10")
    } else {
        println("Не все элементы больше 10")
    }
//Book(name, rating). Есть List<Book> - надо найти топ 5 книг с наивысшим рейтингом

    val listOfBooks = mutableListOf (
     Book(name = "Java", rating = 6),
     Book(name = "Kotlin", rating = 5),
     Book(name = "C", rating = 4),
     Book(name = "C++", rating = 3),
     Book(name = "C#", rating = 2),
     Book(name = "Basic", rating = 1)
     )

    val sortedListOfBooks = listOfBooks.sortedBy { it.rating }
    val listOfTop5books = sortedListOfBooks.slice(sortedListOfBooks.size-5..sortedListOfBooks.lastIndex)
    println(listOfTop5books)

}







