drop table if exists player;
drop table if exists match;
drop table if exists match_player;
drop table if exists money;

create table player(id int primary key auto_increment,
                    name varchar,
                    last_name varchar,
                    rut varchar,
                    email varchar,
                    phone varchar);

create table match(id int primary key auto_increment,
                    field_name varchar,
                    date varchar,
                    total_amount varchar);

create table match_player(id int primary key auto_increment,
                    player_id integer,
                    match_id integer,
                    paid boolean,
                    participation boolean);

create table money(id int primary key auto_increment,
                    player_id integer,
                    total_amount integer);

alter table match_player add foreign key(player_id) references player(id);
alter table match_player add foreign key(match_id) references match(id);
alter table money add foreign key(player_id) references player(id);
