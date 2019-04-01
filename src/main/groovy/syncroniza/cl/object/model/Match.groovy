package syncroniza.cl.object.model

import syncroniza.cl.object.dto.MatchDTO

class Match implements Serializable {

    int id, totalAmount
    String fieldName
    Date date

    MatchDTO toDTO() {
        def matchDTO = new MatchDTO();
        matchDTO.id = this.id
        matchDTO.totalAmount = this.totalAmount
        matchDTO.fieldName = this.fieldName
        matchDTO.date = this.date
        matchDTO
    }

}
