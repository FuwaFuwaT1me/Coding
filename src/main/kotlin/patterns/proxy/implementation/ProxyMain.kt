package org.example.patterns.proxy.implementation

import org.example.patterns.proxy.implementation.base.Cell
import org.example.patterns.proxy.implementation.empty.EmptyCellProxy
import org.example.patterns.proxy.implementation.mine.MineCellProxy

fun main() {
    val cells = Array(10) { rowIndex ->
        Array<Cell?>(10) { columnIndex ->
            if (rowIndex + columnIndex % 2 == 0) {
                MineCellProxy(rowIndex, columnIndex)
            } else {
                EmptyCellProxy(rowIndex, columnIndex)
            }
        }
    }

    cells.forEach { row ->
        row.forEach { cell ->
            cell?.open()
        }
    }
}