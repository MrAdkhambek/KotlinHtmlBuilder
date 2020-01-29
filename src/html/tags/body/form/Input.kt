package html.tags.body.form

import html.core.tag.TagWithoutText

enum class InputType(val value: String) {
    SUBMIT("submit"),
    BUTTON("button")
}

class Input : TagWithoutText("input") {
    var type: String
        get() = attributes["type"]!!
        set(value) {
            attributes["type"] = value
        }
}

fun Form.input(type: InputType = InputType.SUBMIT, init: Input.() -> Unit) =
    initTag(Input().apply { this.type = type.value }, init)