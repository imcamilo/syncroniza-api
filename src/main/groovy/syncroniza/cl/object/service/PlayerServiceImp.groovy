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
        Player plyr = DTOMapper.toEntity(playerDTO)
        playerMapper.create(plyr.id, plyr.name, plyr.lastName, plyr.rut, plyr.email, plyr.phone)
    }

}
