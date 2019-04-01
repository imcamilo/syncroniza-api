drop table if exists player;
drop table if exists matchPlayer;
drop table if exists match;

create table player(id int primary key auto_increment,
                    name varchar,
                    lastName varchar,
                    rut varchar,
                    email varchar,
                    phone varchar);

create table match(id int primary key auto_increment,
                    fieldName varchar,
                    date varchar,
                    totalAmount varchar);

create table matchPlayer(id int primary key auto_increment,
                    playerId integer,
                    matchId integer,
                    paid boolean);

alter table matchPlayer add foreign key(playerId) references player(id);
alter table matchPlayer add foreign key(matchId) references match(id);