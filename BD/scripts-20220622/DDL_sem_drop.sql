create table sala(
	 predio			varchar(15),
	 numero_sala		varchar(7),
	 capacidade		numeric(4,0),
	 primary key (predio, numero_sala)
);

create table departamento(
	 nome_dept		varchar(20),
	 predio			varchar(15),
	 orcamento		numeric(12,2) check (orcamento > 0),
	 primary key (nome_dept)
);

create table disciplina(
	 disciplina_id		varchar(8),
	 titulo			varchar(50),
	 nome_dept		varchar(20),
	 creditos		numeric(2,0) check (creditos > 0),
	 primary key (disciplina_id),
	 foreign key (nome_dept) references departamento (nome_dept)
	 on delete set null
);

create table professor(
	 id			varchar(5),
	 nome			varchar(20) not null,
	 nome_dept		varchar(20),
	 salario		numeric(8,2) check (salario > 1200),
	 primary key (ID),
	 foreign key (nome_dept) references departamento (nome_dept)
	 on delete set null
);

create table turma(
	disciplina_id		varchar(8),
  turma_id		varchar(8),
	semestre		varchar(6) check (semestre in ('Fall', 'Winter', 'Spring', 'Summer')),
	ano			numeric(4,0) check (ano > 1701 and ano < 2100),
	predio			varchar(15),
	numero_sala		varchar(7),
	horario_id		varchar(4),
	primary key (disciplina_id, turma_id, semestre, ano),
	foreign key (disciplina_id) references disciplina (disciplina_id),
	foreign key (predio, numero_sala) references sala (predio, numero_sala)
	on delete set null
);

create table ensina(
	 id			varchar(5),
	 disciplina_id		varchar(8),
	 turma_id		varchar(8),
	 semestre		varchar(6),
	 ano			numeric(4,0),
	 primary key (id, disciplina_id, turma_id, semestre, ano),
	 foreign key (disciplina_id, turma_id, semestre, ano) references turma (disciplina_id, turma_id, semestre, ano)
	 on delete cascade,
	 foreign key (id) references professor (id)
);

create table aluno(
	 id			varchar(5),
	 nome			varchar(20) not null,
	 nome_dept		varchar(20),
	 tot_cred		numeric(3,0) check (tot_cred >= 0),
	 primary key (id),
	 foreign key (nome_dept) references departamento (nome_dept)
	 on delete set null
);

create table aluno_cursa(
	 id			varchar(5),
	 disciplina_id		varchar(8),
	 turma_id		varchar(8),
	 semestre		varchar(6),
	 ano			numeric(4,0),
	 nota		        varchar(2),
	 primary key (id, disciplina_id, turma_id, semestre, ano),
	 foreign key (disciplina_id, turma_id, semestre, ano) references turma (disciplina_id, turma_id, semestre, ano)
	 on delete cascade,
	 foreign key (id) references aluno (id)
	 on delete cascade
);

create table prof_orienta(
	 a_id			varchar(5),
	 p_id			varchar(5),
	 primary key (a_id),
	 foreign key (p_id) references professor (id)
	 on delete set null,
	 foreign key (a_id) references aluno (ID)
	 on delete cascade
);

create table horario(
	horario_id		varchar(4),
	dia			varchar(1),
	hora_inicio		numeric(2) check (hora_inicio >= 0 and hora_inicio < 24),
	min_inicio		numeric(2) check (min_inicio >= 0 and min_inicio < 60),
	hora_fim		numeric(2) check (hora_fim >= 0 and hora_fim < 24),
	min_fim		numeric(2) check (min_fim >= 0 and min_fim < 60),
	primary key (horario_id, dia, hora_inicio, min_inicio)
);

create table prereq(
	disciplina_id		varchar(8),
	prereq_id		varchar(8),
	primary key (disciplina_id, prereq_id),
	foreign key (disciplina_id) references disciplina (disciplina_id)
	on delete cascade,
	foreign key (prereq_id) references disciplina (disciplina_id)
);
