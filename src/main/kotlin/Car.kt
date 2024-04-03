import com.fasterxml.jackson.annotation.JsonProperty

class Car(val model: String,
          val year: Int,
          val color: Color,
          @JsonProperty(value = "version")
          val luxVersion: Boolean? = null) {
    fun isCarsTheSame(car: Car) {
        // val result = if (firstCar.hashCode().equals(secondCar.hashCode())) true else false
        println("Это одна и та же машина: " + (this.hashCode() == car.hashCode()))
    }

    fun isCarsSimilar(car: Car) {
        val areCarsSimilar: Boolean
        if (
            (this.year == car.year) &&
            (this.model == car.model) &&
            (this.color == car.color) &&
            (this.luxVersion == car.luxVersion) //
        ) {
            areCarsSimilar = true
        } else {
            areCarsSimilar = false
        }
        println("Машины одинаковы по техническим характеристикам: $areCarsSimilar")
    }
}