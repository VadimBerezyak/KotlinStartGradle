import kotlin.math.PI

class Circle (private val radius: Float, center : Point) : Shape{
    override fun calculatePerimeterOfShape(): Float {
        return (PI*2.0*radius).toFloat()
    }

    override fun calculateAreaOfShape(): Float {
        return (PI*radius*radius).toFloat()
    }

}