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
         }"""
    //val carFromJson: Car = mapper.readValue(content = carJson2, valueType = Car::class.java)

    println(firstCar.isCarsSimilar(secondCar))
    println(firstCar.isCarsTheSame(secondCar))
    println(secondCar.hashCode())
    println(firstCar.hashCode())

    val p1 = Point(x = 0.0f, y = 3.0f)
    val p2 = Point(x = 4.0f, y = 0.0f)
    val rectangle = Rectangle(p1, p2)
    val circle = Circle(radius = 3.0f, center = p1)

    println("Distance = " + p1.distance(p2))
    println("Square of rectangle = " + rectangle.calculateAreaOfShape())
    println("Perimetr of rectangle = " + rectangle.calculatePerimeterOfShape())

    println("Square of circle = " + circle.calculateAreaOfShape())
    println("Perimetr of circle = " + circle.calculatePerimeterOfShape())



}

