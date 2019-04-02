package syncroniza.cl.object.service

import syncroniza.cl.object.dto.MoneyDTO
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.dto.PlayerDetailDTO

interface PlayerService {

    def create(PlayerDTO playerDTO)

    def addMoney(MoneyDTO moneyDTO)

    List<PlayerDetailDTO> playerList(int offset, int limit)

    PlayerDTO getPlayer(int id)

    List<PlayerDTO> matchPlayers(int matchId)

}