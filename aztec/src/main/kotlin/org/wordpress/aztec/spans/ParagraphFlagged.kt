package org.wordpress.aztec.spans

interface ParagraphFlagged {
    var startBeforeCollapse: Int
    fun clearStartBeforeCollapse() { startBeforeCollapse = -1 }
    fun hasCollapsed(): Boolean { return startBeforeCollapse != -1 }

    var endBeforeBleed: Int
    fun clearEndBeforeBleed() { endBeforeBleed = -1 }
    fun hasBled(): Boolean { return endBeforeBleed != -1 }
}
