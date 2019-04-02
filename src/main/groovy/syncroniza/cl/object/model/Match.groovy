package syncroniza.cl.object.model

import syncroniza.cl.object.dto.MatchDTO

class Match implements Serializable {

    int id, total_amount
    String field_name
    Date date

    MatchDTO toDTO() {
        MatchDTO matchDTO = new MatchDTO();
        matchDTO.id = this.id
        matchDTO.totalAmount = this.total_amount
        matchDTO.fieldName = this.field_name
        matchDTO.date = this.date
        matchDTO
    }

}
