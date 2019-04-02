package syncroniza.cl.object.model

import syncroniza.cl.object.dto.PlayerDTO

class Player implements Serializable {

    int id
    String name, last_name, rut, email, phone

    PlayerDTO toDTO() {
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.id = this.id
        playerDTO.name = this.name
        playerDTO.lastName = this.last_name
        playerDTO.rut = this.rut
        playerDTO.email = this.email
        playerDTO.phone = this.phone
        playerDTO
    }

}
