package be.mbict.hellomaven

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class HelloMavenApplication

fun main(args: Array<String>) {
	runApplication<HelloMavenApplication>(*args)
}
