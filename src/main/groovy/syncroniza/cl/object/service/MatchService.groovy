package syncroniza.cl.object.service

import syncroniza.cl.object.dto.MatchDTO
import syncroniza.cl.object.dto.MatchPlayerDTO

interface MatchService {

    def create(MatchDTO matchDTO)

    def addPlayer(MatchPlayerDTO matchPlayerDTO)

    List<MatchDTO> matchListWithNumberOfPlayers(int offset, int limit)

    MatchDTO getMatch(int id)

}