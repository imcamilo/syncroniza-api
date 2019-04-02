package syncroniza.cl.object.util

import syncroniza.cl.object.dto.MatchDTO
import syncroniza.cl.object.dto.MatchPlayerDTO
import syncroniza.cl.object.dto.MoneyDTO
import syncroniza.cl.object.dto.PlayerDTO
import syncroniza.cl.object.model.Match
import syncroniza.cl.object.model.MatchPlayer
import syncroniza.cl.object.model.Money
import syncroniza.cl.object.model.Player

class DTOMapper {

    static void toEntity(PlayerDTO playerDTO, Player player) {
        player.id = playerDTO.id
        player.name = playerDTO.name
        player.last_name = playerDTO.lastName
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
        match.field_name = matchDTO.fieldName
        match.date = matchDTO.date
        match.total_amount = matchDTO.totalAmount
    }

    static Match toEntity(MatchDTO matchDTO) {
        Match match = new Match();
        toEntity(matchDTO, match);
        match;
    }

    static void toEntity(MatchPlayerDTO mPlayerDTO, MatchPlayer mPlayer) {
        mPlayer.id = mPlayerDTO.id
        mPlayer.match_id = mPlayerDTO.matchId
        mPlayer.player_id = mPlayerDTO.playerId
        mPlayer.paid = mPlayerDTO.paid
        mPlayer.participation = mPlayerDTO.participation
    }

    static MatchPlayer toEntity(MatchPlayerDTO mPlayerDTO) {
        MatchPlayer mPlayer = new MatchPlayer();
        toEntity(mPlayerDTO, mPlayer);
        mPlayer;
    }
    static void toEntity(MoneyDTO moneyDTO, Money money) {
        money.id = moneyDTO.id
        money.player_id = moneyDTO.playerId
        money.total_amount = moneyDTO.totalAmount
    }

    static Money toEntity(MoneyDTO moneyDTO) {
        Money money = new Money();
        toEntity(moneyDTO, money);
        money;
    }

}
