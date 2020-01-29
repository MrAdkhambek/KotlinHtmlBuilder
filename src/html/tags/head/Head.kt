package html.tags.head

import html.core.tag.TagWithText


class Head : TagWithText("head")

fun Head.title(init: Title.() -> Unit) = initTag(Title(), init)