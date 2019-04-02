package syncroniza.cl.object.model

import syncroniza.cl.object.dto.MoneyDTO

class Money implements Serializable {

    int id, player_id, total_amount

    MoneyDTO toDTO() {
        MoneyDTO moneyDTO = new MoneyDTO();
        moneyDTO.id = this.id
        moneyDTO.playerId = this.player_id
        moneyDTO.totalAmount = this.total_amount
        moneyDTO
    }

}
