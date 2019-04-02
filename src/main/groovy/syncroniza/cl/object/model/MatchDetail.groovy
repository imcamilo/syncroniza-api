package syncroniza.cl.object.model

import syncroniza.cl.object.dto.MatchDetailDTO

class MatchDetail extends Match{

    int total_players

    MatchDetailDTO toDTO() {
        MatchDetailDTO matchDTO = new MatchDetailDTO();
        matchDTO.id = this.id
        matchDTO.fieldName = this.field_name
        matchDTO.totalAmount = this.total_amount
        matchDTO.date = this.date
        matchDTO.totalPlayers = this.total_players
        matchDTO
    }

}
