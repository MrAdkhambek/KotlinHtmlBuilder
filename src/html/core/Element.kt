package html.core

interface Element {
    fun render(builder: StringBuilder, indent: String)
}