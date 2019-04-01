package syncroniza.cl.object.service

import syncroniza.cl.object.dto.MoneyDTO
import syncroniza.cl.object.dto.PlayerDTO

interface PlayerService {

    def create(PlayerDTO playerDTO)

    def addMoney(MoneyDTO moneyDTO)

}