package syncroniza.cl.object.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import syncroniza.cl.object.dto.MatchPlayerDTO
import syncroniza.cl.object.model.Match
import syncroniza.cl.object.dto.MatchDTO
import syncroniza.cl.object.mapper.MatchMapper
import syncroniza.cl.object.mapper.MatchPlayerMapper
import syncroniza.cl.object.model.MatchPlayer
import syncroniza.cl.object.util.DTOMapper

@Service
class MatchServiceImp implements MatchService {

    @Autowired
    MatchMapper matchMapper

    @Autowired
    MatchPlayerMapper matchPlayerMapper

    def create(MatchDTO matchDTO) {
        Match match = DTOMapper.toEntity(matchDTO)
        matchMapper.create(match.fieldName, match.date.toString(), match.totalAmount)
    }

    def addPlayer(MatchPlayerDTO matchPlayerDTO) {
        MatchPlayer matchPlayer = DTOMapper.toEntity(matchPlayerDTO)
        matchPlayerMapper.create(matchPlayer.playerId,
                matchPlayer.matchId,
                matchPlayer.paid,
                matchPlayer.participation)
    }

}
