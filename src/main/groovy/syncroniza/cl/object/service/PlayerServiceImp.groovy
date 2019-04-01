package syncroniza.cl.object.service

import org.springframework.beans.factory.annotation.Autowired
import syncroniza.cl.object.Player
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.mapper.PlayerMapper
import syncroniza.cl.object.util.DTOMapper

class PlayerServiceImp implements PlayerService {

    @Autowired
    PlayerMapper playerMapper

    def create(PlayerDTO playerDTO) {
        Player plyr = DTOMapper.toEntity(playerDTO)
        playerMapper.create(plyr.id, plyr.name, plyr.lastName, plyr.rut, plyr.email, plyr.phone)
    }

}
