package be.mbict.hellogoogle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class HelloGoogleApplication

fun main(args: Array<String>) {
	runApplication<HelloGoogleApplication>(*args)
}
