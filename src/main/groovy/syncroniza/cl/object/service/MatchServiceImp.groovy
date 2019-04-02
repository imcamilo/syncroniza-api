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
        matchMapper.create(match.field_name, match.date.toString(), match.total_amount)
    }

    def addPlayer(MatchPlayerDTO matchPlayerDTO) {
        MatchPlayer matchPlayer = DTOMapper.toEntity(matchPlayerDTO)
        matchPlayerMapper.create(matchPlayer.player_id,
                matchPlayer.match_id,
                matchPlayer.paid,
                matchPlayer.participation)
    }

    List<MatchDTO> matchListWithNumberOfPlayers(int offset, int limit) {
        List<Match> listOfMatches = matchMapper.matchListWithNumberOfPlayers(offset, limit)
        listOfMatches.stream().map{match -> match.toDTO()}.collect()
    }

    MatchDTO getMatch(int id) {
        matchMapper.getMatch(id).toDTO()
    }

}
