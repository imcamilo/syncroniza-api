package syncroniza.cl.object.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import syncroniza.cl.object.dto.MatchDTO
import syncroniza.cl.object.dto.MatchPlayerDTO
import syncroniza.cl.object.service.MatchService
import syncroniza.cl.object.service.PlayerService

@RestController
@RequestMapping("/api/v1/matches")
class MatchController {

    @Autowired
    private MatchService matchService

    @Autowired
    private PlayerService playerService

    @PostMapping
    def create(@RequestBody MatchDTO matchDTO) {
        matchService.create(matchDTO)
    }

    @PostMapping("/players")
    def addPlayer(@RequestBody MatchPlayerDTO matchPlayerDTO) {
        matchService.addPlayer(matchPlayerDTO)
    }

    @GetMapping("/{id}/players")
    def matchPlayers(@PathVariable int id) {
        playerService.matchPlayers(id)
    }

}
