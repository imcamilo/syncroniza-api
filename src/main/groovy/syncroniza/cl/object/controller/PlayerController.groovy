package syncroniza.cl.object.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.service.PlayerService

@RestController
@RequestMapping("/api/v1/players")
class PlayerController {

    @Autowired
    PlayerService playerService

    @PostMapping
    def create(@RequestBody PlayerDTO playerDTO) {
        playerService.create(playerDTO)
    }

}
