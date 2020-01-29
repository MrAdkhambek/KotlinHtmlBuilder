package html.tags.body

import html.core.tag.TagWithText

class A : TagWithText("a") {
    var href: String
        get() = attributes["href"]!!
        set(value) {
            attributes["href"] = value
        }
}

fun Body.a(href: String, init: A.() -> Unit) = initTag(A().apply { this.href = href }, init)

