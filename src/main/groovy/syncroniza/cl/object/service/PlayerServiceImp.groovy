package syncroniza.cl.object.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import syncroniza.cl.object.dto.MoneyDTO
import syncroniza.cl.object.dto.PlayerDetailDTO
import syncroniza.cl.object.mapper.MoneyMapper
import syncroniza.cl.object.model.Money
import syncroniza.cl.object.model.Player
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.mapper.PlayerMapper
import syncroniza.cl.object.model.PlayerDetail
import syncroniza.cl.object.util.DTOMapper

@Service
class PlayerServiceImp implements PlayerService {

    @Autowired
    PlayerMapper playerMapper

    @Autowired
    MoneyMapper moneyMapper

    def create(PlayerDTO playerDTO) {
        Player player = DTOMapper.toEntity(playerDTO)
        playerMapper.create(player.name, player.last_name, player.rut, player.email, player.phone)
    }

    def addMoney(MoneyDTO moneyDTO) {
        Money money = DTOMapper.toEntity(moneyDTO)
        moneyMapper.add(money.player_id, money.total_amount)
    }

    List<PlayerDetailDTO> playerList(int offset, int limit) {
        List<PlayerDetail> playerList = playerMapper.playerList(offset, limit)
        playerList.stream().map{player -> player.toDTO()}.collect()
    }

    PlayerDTO getPlayer(int id) {
        playerMapper.getPlayer(id).toDTO()
    }

    List<PlayerDTO> matchPlayers(int matchId) {
        List<Player> playerList = playerMapper.matchPlayers(matchId)
        playerList.stream().map{player -> player.toDTO()}.collect()
    }

}
