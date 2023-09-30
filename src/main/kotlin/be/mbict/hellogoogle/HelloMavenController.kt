package be.mbict.hellogoogle

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/maven")
class HelloMavenController(private val maven: MavenClient) {

    @GetMapping
    fun hello() = "Hello Maven"

    @GetMapping("/search/{query}")
    fun search(@PathVariable("query") query: String) =
        maven.search(query)
}