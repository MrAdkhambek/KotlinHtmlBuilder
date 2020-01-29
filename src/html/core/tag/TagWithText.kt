package html.core.tag

import html.core.TextElement

abstract class TagWithText(name: String) : Tag(name, true) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}

abstract class TagWithoutText(name: String) : Tag(name, false)