import kotlin.math.PI

data class Rectangle(val pointUpLeft: Point, val pointDownRight: Point ): Shape {
    override fun calculatePerimeterOfShape(): Float {
        return((pointDownRight.x - pointUpLeft.x) + (pointUpLeft.y - pointDownRight.y))*2
    }

    override fun calculateAreaOfShape(): Float {
        return (pointDownRight.x - pointUpLeft.x) * (pointUpLeft.y - pointDownRight.y)
    }
//    fun squareOfRectangle(): Float {
//        return (pointDownRight.x - pointUpLeft.x) * (pointUpLeft.y - pointDownRight.y)
//
//    }
//    fun perimeterOfRectangle(): Float {
//        return ((pointDownRight.x - pointUpLeft.x) + (pointUpLeft.y - pointDownRight.y))*2
//    }
}

