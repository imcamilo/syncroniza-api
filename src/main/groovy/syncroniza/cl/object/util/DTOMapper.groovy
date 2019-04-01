package syncroniza.cl.object.util

import syncroniza.cl.object.Player
import syncroniza.cl.object.dto.PlayerDTO

class DTOMapper {

    static void toEntity(PlayerDTO playerDTO, Player player) {
        player.id = playerDTO.id
        player.name = playerDTO.name
        player.lastName = playerDTO.lastName
        player.rut = playerDTO.rut
        player.email = playerDTO.email
        player.phone = playerDTO.phone
    }

    static Player toEntity(PlayerDTO playerDTO) {
        Player player = new Player();
        toEntity(playerDTO, player);
        player;
    }

}
