import kweb.Kweb
import kweb.h1
import kweb.plugins.fomanticUI.fomanticUIPlugin

fun main(args: Array<String>) {
  Kweb(port = 80, debug = false, plugins = listOf(fomanticUIPlugin)) {
    doc.body {
      h1().text("Replace Me!")
    }
  }
}
