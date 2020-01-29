package html.core.tag

import html.core.Element

abstract class Tag(val name: String, val isPaired: Boolean) : Element {

    val children = arrayListOf<Element>()
    val attributes = hashMapOf<String, String>()

    fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        children.add(tag)
        return tag
    }

    fun <T : Element> T.setAttributes(vararg args: Pair<String, String>): T {
        for (attr in args) {
            attributes[attr.first] = attr.second
        }
        return this
    }

    override fun render(builder: StringBuilder, indent: String) {
        val open = "$indent<$name${renderAttributes()}${if (isPaired) ">" else "/>"}\n"
        builder.append(open)
        for (c in children) {
            c.render(builder, "$indent  ")
        }
        if (isPaired) builder.append("$indent</$name>\n")
    }

    private fun renderAttributes(): String? {
        val builder = StringBuilder()
        for (a in attributes.keys) {
            builder.append(" $a=\"${attributes[a]}\"")
        }
        return builder.toString()
    }

    override fun toString(): String {
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }
}