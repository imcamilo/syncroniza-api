package syncroniza.cl.object.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import syncroniza.cl.object.dto.MatchDTO
import syncroniza.cl.object.service.MatchService

@RestController
@RequestMapping("/api/v1/matchs")
class MatchController {

    @Autowired
    private MatchService matchService

    @PostMapping
    def create(@RequestBody MatchDTO matchDTO) {
        matchService.create(matchDTO)
    }

}
