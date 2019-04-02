package syncroniza.cl.object.model

import syncroniza.cl.object.dto.PlayerDetailDTO

class PlayerDetail extends Player {

    int amount

    PlayerDetailDTO toDTO() {
        PlayerDetailDTO detailDTO = new PlayerDetailDTO();
        detailDTO.id = this.id
        detailDTO.name = this.name
        detailDTO.lastName = this.last_name
        detailDTO.rut = this.rut
        detailDTO.email = this.email
        detailDTO.phone = this.phone
        detailDTO.amount = this.amount
        detailDTO
    }

}
