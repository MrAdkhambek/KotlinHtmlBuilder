package html.tags.body

import html.core.tag.TagWithText


class Body : BodyTag("body")

abstract class BodyTag(name: String) : TagWithText(name)