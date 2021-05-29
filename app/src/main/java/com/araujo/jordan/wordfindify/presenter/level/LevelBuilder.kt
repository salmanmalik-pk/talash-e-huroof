/**
 * Designed and developed by Jordan Lira (@araujojordan)
 *
 * Copyright (C) 2020 Jordan Lira de Araujo Junior
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.araujo.jordan.wordfindify.presenter.level

import com.araujo.jordan.wordfindify.models.Level

/**
 * Presenter that generate game levels
 * @author Jordan L. Araujo Jr. (araujojordan)
 */
class LevelBuilder {

    private val levels = listOf(
        Level(1, "levelone"),
        Level(2, "leveltwo"),
        Level(3, "levelthree"),
        Level(4, "levelfour"),
        Level(5, "levelfive"),
        Level(6, "levelsix"),
        Level(7, "levelseven"),
        Level(8, "leveleight"),
        Level(9, "levelnine"),
        Level(10, "levelten"),
        Level(11, "leveleleven"),
        Level(12, "leveltwelve")
    )

    /**
     * Get levels (levels are read-only)
     */
    fun getLevels() = levels

    /**
     * Get category of a given level
     */
    fun getCategory(level: Int) = levels.firstOrNull { it.level == level }?.category ?: "levelone"
}