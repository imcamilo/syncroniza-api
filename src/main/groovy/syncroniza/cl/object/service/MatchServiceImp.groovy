package syncroniza.cl.object.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import syncroniza.cl.object.Match
import syncroniza.cl.object.dto.MatchDTO
import syncroniza.cl.object.mapper.MatchMapper
import syncroniza.cl.object.util.DTOMapper

@Service
class MatchServiceImp implements MatchService {

    @Autowired
    MatchMapper matchMapper

    def create(MatchDTO matchDTO) {
        Match match = DTOMapper.toEntity(matchDTO)
        matchMapper.create(match.id, match.fieldName, match.date.toString(), match.totalAmount)
    }

}
