package syncroniza.cl.object.util

import syncroniza.cl.object.dto.MatchDTO
import syncroniza.cl.object.dto.MatchPlayerDTO
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.model.Match
import syncroniza.cl.object.model.MatchPlayer
import syncroniza.cl.object.model.Player

class DTOMapper {

    static void toEntity(PlayerDTO playerDTO, Player player) {
        player.id = playerDTO.id
        player.name = playerDTO.name
        player.lastName = playerDTO.lastName
        player.rut = playerDTO.rut
        player.email = playerDTO.email
        player.phone = playerDTO.phone
    }

    static Player toEntity(PlayerDTO playerDTO) {
        Player player = new Player();
        toEntity(playerDTO, player);
        player;
    }

    static void toEntity(MatchDTO matchDTO, Match match) {
        match.id = matchDTO.id
        match.fieldName = matchDTO.fieldName
        match.date = matchDTO.date
        match.totalAmount = matchDTO.totalAmount
    }

    static Match toEntity(MatchDTO matchDTO) {
        Match match = new Match();
        toEntity(matchDTO, match);
        match;
    }

    static void toEntity(MatchPlayerDTO mPlayerDTO, MatchPlayer mPlayer) {
        mPlayer.id = mPlayerDTO.id
        mPlayer.matchId = mPlayerDTO.matchId
        mPlayer.playerId = mPlayerDTO.playerId
        mPlayer.paid = mPlayerDTO.paid
        mPlayer.participation = mPlayerDTO.participation
    }

    static MatchPlayer toEntity(MatchPlayerDTO mPlayerDTO) {
        MatchPlayer mPlayer = new MatchPlayer();
        toEntity(mPlayerDTO, mPlayer);
        mPlayer;
    }

}
