package org.example.patterns.proxy.implementation.empty

import org.example.patterns.proxy.implementation.base.Cell

/**
 * Уточнение ячейки минного поля, в качестве пустой ячейки
 */
class EmptyCell(
    private val left: Int,
    private val top: Int
): Cell(left, top) {

    init {
        // Загружаем тяжелое изображение пустой ячейки
    }

    override fun getPoints(): Int = 10
}