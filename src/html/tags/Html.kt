package html.tags

import html.tags.head.Head
import html.core.tag.TagWithText
import html.tags.body.Body

class HTML() : TagWithText("html") {
    fun head(init: Head.() -> Unit) = initTag(Head(), init)

    fun body(init: Body.() -> Unit) = initTag(Body(), init)
}

fun html(init: HTML.() -> Unit): HTML = HTML().apply(init)