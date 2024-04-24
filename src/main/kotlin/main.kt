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

    val resultMap = listOfStrings.groupBy({ it.first().lowercase() }, {it})

    println(resultMap)
}






