import kotlin.math.pow
import kotlin.math.sqrt

data class Point(val x: Float, val y: Float) {

    fun distance(point: Point): Float {
        return (sqrt((this.x - point.x).pow(2) +(this.y - point.y).pow(2)))
    }
}