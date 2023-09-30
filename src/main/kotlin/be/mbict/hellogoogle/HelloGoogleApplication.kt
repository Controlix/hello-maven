package be.mbict.hellogoogle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloGoogleApplication

fun main(args: Array<String>) {
	runApplication<HelloGoogleApplication>(*args)
}
