package be.mbict.hellomaven

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "maven")
interface MavenClient {

    @RequestMapping(method = [RequestMethod.GET], value = ["solrsearch/select"])
    fun search(@RequestParam("q") query: String) : String
}