data class Rectangle(val pointUpLeft: Point, val pointDownRight: Point ) {
    fun squareOfRectangle(): Float {
        return (pointDownRight.x - pointUpLeft.x) * (pointUpLeft.y - pointDownRight.y)

    }
    fun perimeterOfRectangle(): Float {
        return ((pointDownRight.x - pointUpLeft.x) + (pointUpLeft.y - pointDownRight.y))*2
    }
}

