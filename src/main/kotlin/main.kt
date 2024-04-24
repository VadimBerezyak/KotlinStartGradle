import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import java.util.stream.Collector


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
         }"""
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
        Person("Eve", 40),
        Person("Bob", 25),
        Person("Bob", 25)
    )
    val count = 0
    val duplicates = people.groupingBy { person -> person}
        .eachCount()
    //.maxOfOrNull { it.value }
    val maxCount = duplicates.maxOfOrNull { it.value }
    for (i in duplicates.values){
        if (i == maxCount){
            val maximum11 = duplicates.filterValues { it == maxCount }.keys
            println(maximum11)
        }
    }
}
