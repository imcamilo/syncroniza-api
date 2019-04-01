package syncroniza.cl.object.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import syncroniza.cl.object.model.Player
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.mapper.PlayerMapper
import syncroniza.cl.object.util.DTOMapper

@Service
class PlayerServiceImp implements PlayerService {

    @Autowired
    PlayerMapper playerMapper

    def create(PlayerDTO playerDTO) {
        Player player = DTOMapper.toEntity(playerDTO)
        playerMapper.create(player.name, player.lastName, player.rut, player.email, player.phone)
    }

}
