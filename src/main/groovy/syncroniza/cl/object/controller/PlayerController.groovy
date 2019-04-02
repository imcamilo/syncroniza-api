package syncroniza.cl.object.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import syncroniza.cl.object.dto.MoneyDTO
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.service.PlayerService

@RestController
@RequestMapping("/api/v1/players")
class PlayerController {

    @Autowired
    private PlayerService playerService

    @PostMapping
    def create(@RequestBody PlayerDTO playerDTO) {
        playerService.create playerDTO
    }

    @PostMapping("/money")
    def addMoney(@RequestBody MoneyDTO moneyDTO) {
        playerService.addMoney moneyDTO
    }

    @GetMapping("/{id}")
    def getPlayer(@PathVariable int id) {
        playerService.getPlayer id
    }

    @GetMapping
    def playerList() {
        //TODO page, pagination
        playerService.playerList(0, 20)
    }

}
