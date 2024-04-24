import kotlin.math.PI

data class Rectangle(val pointUpLeft: Point, val pointDownRight: Point) : Shape {
    override fun calculateShapePerimeter(): Float {
        return ((pointDownRight.x - pointUpLeft.x) + (pointUpLeft.y - pointDownRight.y)) * 2
    }

    override fun calculateShapeSquare(): Float {
        return (pointDownRight.x - pointUpLeft.x) * (pointUpLeft.y - pointDownRight.y)
    }
}

