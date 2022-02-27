package com.icosahedron.tspace

typealias Count = ULong

enum class Direction { W, X, Y, Z }

data class Tetray(private val coordinates: Array<Count>) {
    operator fun get(direction: Int) = coordinates[direction]
    fun sum() = coordinates.sum()
    fun move(direction: Int) { coordinates[direction] = coordinates[direction] + 1UL }
    fun shift(fromDirection: Int, toDirection: Int) { }

    private fun increment(direction: Int) { coordinates[direction] = coordinates[direction] + 1UL }
    private fun decrement(direction: Int) { coordinates[direction] = coordinates[direction] - 1UL }
//    fun sum() = w + x + y + z
//
//    fun move(direction: Direction) = when(direction) {
//
//
//    }.increment(this)
//
//    fun redirect(from: Direction, to: Direction) =
//
//    fun increment(n: Int) { coordinates[n] = coordinates[n] + 1 }
//
//    fun decrement(n: Int) { coordinates[n] = coordinates[n] - 1 }
//
//    fun canDecrement(n: Int) = coordinates[n] > 0
}
