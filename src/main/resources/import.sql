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


insert into player (name, last_name, rut, email, phone) values ('c','jorquera', '1-345234', 'jorquera@gmail.com', '12');
insert into player (name, last_name, rut, email, phone) values ('r','meza', '1-34523345', 'meza@xcv.com', '12');
insert into player (name, last_name, rut, email, phone) values ('c','romann', '1-3452324', 'romann@xzz.com', '12');
insert into player (name, last_name, rut, email, phone) values ('f','valencia', '1-3451324', 'valencia@zx.com', '12');
insert into player (name, last_name, rut, email, phone) values ('l','olivares', '1-3451329', 'olivares@gm121ail.com', '12');
insert into player (name, last_name, rut, email, phone) values ('d','hernandez', '1-3451320', 'hernandez@23.com', '12');
insert into player (name, last_name, rut, email, phone) values ('b','gonzalez', '3-3451320', 'gonzalez.com', '12');
insert into player (name, last_name, rut, email, phone) values ('m','alfaro', '3-3451320', 'alfaro@asd.com', '12');
insert into player (name, last_name, rut, email, phone) values ('f','vallejos', '3-342320', 'vallejos@gmail.com', '12');
insert into player (name, last_name, rut, email, phone) values ('p','quintanilla', '3-3431320', 'quintanilla@gmail.com', '12');
insert into player (name, last_name, rut, email, phone) values ('f','mansilla', '3-6451320', 'mansilla@gmail.com', '12');
insert into player (name, last_name, rut, email, phone) values ('a','jorquera', '3-3461320', 'jorquera@outlook.com', '12');

insert into money (player_id, total_amount) values (1, 5000);
insert into money (player_id, total_amount) values (2, 12000);
insert into money (player_id, total_amount) values (3, 13000);
insert into money (player_id, total_amount) values (4, 40000);
insert into money (player_id, total_amount) values (1, 2500);
insert into money (player_id, total_amount) values (1, 2500);

insert into match (field_name, date, total_amount) values ('FEN', null, 43000);
insert into match (field_name, date, total_amount) values ('ABC', null, 43000);
insert into match (field_name, date, total_amount) values ('DEF', null, 53000);
insert into match (field_name, date, total_amount) values ('GHI', null, 43000);
insert into match (field_name, date, total_amount) values ('JKL', null, 40000);
insert into match (field_name, date, total_amount) values ('MNO', null, 42000);
insert into match (field_name, date, total_amount) values ('PQR', null, 42000);

insert into match_player (player_id, match_id, paid, participation) values (1, 1, true, true);
insert into match_player (player_id, match_id, paid, participation) values (2, 1, true, true);
insert into match_player (player_id, match_id, paid, participation) values (3, 1, true, true);
insert into match_player (player_id, match_id, paid, participation) values (4, 1, false, true);
insert into match_player (player_id, match_id, paid, participation) values (5, 1, false, true);
insert into match_player (player_id, match_id, paid, participation) values (6, 1, false, true);
insert into match_player (player_id, match_id, paid, participation) values (7, 1, false, true);
insert into match_player (player_id, match_id, paid, participation) values (1, 2, false, true);
insert into match_player (player_id, match_id, paid, participation) values (2, 2, false, true);
insert into match_player (player_id, match_id, paid, participation) values (9, 2, false, true);


