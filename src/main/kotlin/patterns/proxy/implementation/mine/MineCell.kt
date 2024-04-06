package org.example.patterns.proxy.implementation.mine

import org.example.patterns.proxy.implementation.base.Cell

/**
 * Уточнение ячейки минного поля, в качестве мины
 */
class MineCell(
    private val left: Int,
    private val top: Int
): Cell(left, top) {

    init {
        // Загружаем тяжелое изображение ячейки с миной
    }

    override fun getPoints(): Int = 100
}