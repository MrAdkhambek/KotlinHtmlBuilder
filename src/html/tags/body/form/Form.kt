package html.tags.body.form

import html.core.tag.TagWithText
import html.tags.body.Body

class Form : TagWithText("form")

fun Body.form(init: Form.() -> Unit) = initTag(Form(), init)