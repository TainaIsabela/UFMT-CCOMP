
create database copa2014;

use copa;

create table pais(
  nome_do_pais varchar(20) not null,
  populacao decimal(10, 2),
  numero_de_vitorias_em_copas integer,
  tecnico varchar(20),
  primary key (nome_do_pais)
);

create table jogadores(
  jogador_id integer not null,
  nome varchar(40),
  primeiro_nome varchar(20),
  ultimo_nome varchar(35),
  data_nascimento date,
  pais varchar(20) not null,
  altura integer,
  clube varchar(30),
  posicao varchar(10),
  jogos_pelo_pais integer,
  capitao boolean,
  primary key (jogador_id),
  foreign key (pais) references pais(nome_do_pais) 
);

create table resultados_jogos(
  partida_id integer not null,
  data_jogo date,
  hora_inicio time,
  time1 varchar(25) not null,
  time2 varchar(25) not null,
  gols_time1 integer,
  gols_time2 integer,
  estadio varchar(35),
  cidade_sede varchar(20),
  primary key (partida_id),
  foreign key (time1) references pais(nome_do_pais),
  foreign key (time2) references pais(nome_do_pais)
);

create table cartoes_jogadores(
  jogador_id integer not null,
  numero_de_cartoes_amarelos integer,
  numero_de_cartoes_vermelhos integer,
  primary key (jogador_id),
  foreign key (jogador_id) references jogadores(jogador_id)
);

create table gols_assistencias_jogadores(
  jogador_id integer not null,
  numero_de_jogos integer,
  gols integer,
  assistencias integer,
  minutos_jogados integer,
  primary key (jogador_id),
  foreign key (jogador_id) references jogadores(jogador_id)
);
