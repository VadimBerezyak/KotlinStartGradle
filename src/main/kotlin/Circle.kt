import kotlin.math.PI

class Circle (private val radius: Float, center : Point) : Shape{
    override fun perimeterOfShape(): Float {
        return (PI*2.0*radius).toFloat()
    }

    override fun squareOfShape(): Float {
        return (PI*radius*radius).toFloat()
    }

}