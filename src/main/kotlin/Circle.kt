import kotlin.math.PI

class Circle(private val radius: Float) : Shape {
    override fun calculateShapePerimeter(): Float {
        return (PI * 2.0 * radius).toFloat()
    }

    override fun calculateShapeSquare(): Float {
        return (radius * radius * PI).toFloat()
    }

}