fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Mita")
    greeter.greet("Dewi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Alif"))
}