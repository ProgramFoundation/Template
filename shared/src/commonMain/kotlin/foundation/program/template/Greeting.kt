package foundation.program.template

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}