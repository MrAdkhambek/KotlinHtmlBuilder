package html.tags.body

import html.core.tag.TagWithText

class B : TagWithText("b")

fun Body.b(init: B.() -> Unit) = initTag(B(), init)