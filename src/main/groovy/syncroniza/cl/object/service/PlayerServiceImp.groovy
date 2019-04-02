package syncroniza.cl.object.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import syncroniza.cl.object.dto.MoneyDTO
import syncroniza.cl.object.mapper.MoneyMapper
import syncroniza.cl.object.model.Money
import syncroniza.cl.object.model.Player
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.mapper.PlayerMapper
import syncroniza.cl.object.util.DTOMapper

@Service
class PlayerServiceImp implements PlayerService {

    @Autowired
    PlayerMapper playerMapper

    @Autowired
    MoneyMapper moneyMapper

    def create(PlayerDTO playerDTO) {
        Player player = DTOMapper.toEntity(playerDTO)
        playerMapper.create(player.name, player.lastName, player.rut, player.email, player.phone)
    }

    def addMoney(MoneyDTO moneyDTO) {
        Money money = DTOMapper.toEntity(moneyDTO)
        moneyMapper.add(money.playerId, money.totalAmount)
    }

    List<PlayerDTO> playerList(int offset, int limit) {
        List<Player> playerList = playerMapper.playerList(offset, limit)
        playerList.stream().map{s -> s.toDTO()}.collect()
    }

    PlayerDTO getPlayer(int id) {
        playerMapper.getPlayer(id).toDTO()
    }

}
