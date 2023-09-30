package be.mbict.hellogoogle

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloGoogleController {

    @GetMapping
    fun hello() = "Hello"
}