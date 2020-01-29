import html.tags.body.a
import html.tags.body.b
import html.tags.body.form.form
import html.tags.body.form.input
import html.tags.head.title
import html.tags.html

fun main() {

    val html = html {

        head {
            title {
                +"My framework"
            }
        }

        body {
            a("https://google.com") {
                +"Google"
                +"Search"

                setAttributes(
                    "class" to "link"
                )
            }

            b {
                +"This is text style bold"
            }

            form {
                input {
                    setAttributes(
                        "value" to "OK"
                    )
                }
            }
        }

    }.toString()

    print(html)
}