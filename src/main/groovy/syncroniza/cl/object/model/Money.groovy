package syncroniza.cl.object.model

import syncroniza.cl.object.dto.MoneyDTO

class Money implements Serializable {

    int id, playerId, totalAmount

    MoneyDTO toDTO() {
        MoneyDTO moneyDTO = new MoneyDTO();
        moneyDTO.id = this.id
        moneyDTO.playerId = this.playerId
        moneyDTO.totalAmount = this.totalAmount
        moneyDTO
    }

}
