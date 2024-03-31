package org.example.proxy

/**
 * Уточнение ячейки, как ячейки с миной
 */
class EmptyCell(
    private val left: Int,
    private val top: Int
): Cell(left, top) {

    override fun getPoints(): Int {
        return 100
    }
}