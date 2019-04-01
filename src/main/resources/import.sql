drop table if exists player;
drop table if exists matchPlayer;

create table player(id int primary key auto_increment,
                    name varchar,
                    lastName varchar,
                    rut varchar,
                    email varchar,
                    phone varchar);

create table matchPlayer(id int primary key auto_increment,
                    playerId integer,
                    matchId integer,
                    paid boolean);

alter table matchPlayer add foreign key(playerId) references player(id);