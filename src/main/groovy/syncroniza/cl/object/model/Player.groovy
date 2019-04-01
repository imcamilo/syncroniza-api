package syncroniza.cl.object

import syncroniza.cl.object.dto.PlayerDTO

class Player implements Serializable {

    int id
    String name, lastName, rut, email, phone

    PlayerDTO toDTO() {
        def playerDTO = new PlayerDTO();
        playerDTO.id = this.id
        playerDTO.name = this.name
        playerDTO.lastName = this.lastName
        playerDTO.rut = this.rut
        playerDTO.email = this.email
        playerDTO.phone = this.phone
        playerDTO
    }
}
