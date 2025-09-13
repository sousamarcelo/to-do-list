-- Cadastro de Categorias
INSERT INTO tb_category (name, created_At) VALUES ('Eletrônicos', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Computadores', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Celulares', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Móveis', NOW()); 
INSERT INTO tb_category (name, created_At) VALUES ('Roupas', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Lazer', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Esportes', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Alimentos', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Beleza', NOW());
INSERT INTO tb_category (name, created_At) VALUES ('Educação', NOW());

-- Cadastro Tasks

INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Video Game', 'Play Stantio 5 com controle e um jogo', 'PENDING', NOW(), NULL); 
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Estudar Java', 'Praticar programação com exercícios de orientação a objetos', 'PENDING', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Academia', 'Treino de musculação para membros superiores', 'COMPLETED', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Leitura', 'Ler pelo menos 30 páginas de um livro técnico', 'PENDING', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Cozinhar', 'Preparar almoço saudável com frango e legumes', 'IN_PROGRESS', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Passeio', 'Levar o cachorro para caminhar no parque', 'PENDING', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Organizar Documentos', 'Separar contas e recibos do mês', 'COMPLETED', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Assistir Curso', 'Assistir aula online sobre arquitetura de software', 'IN_PROGRESS', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Mercado', 'Comprar frutas, legumes e itens de limpeza', 'PENDING', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Projeto Spring', 'Criar API REST com Spring Boot para cadastro de usuários', 'IN_PROGRESS', NOW(), NULL);
INSERT INTO tb_task (title, description, status, created_at, update_at) VALUES ('Series', 'Assistir episódio novo da série favorita', 'COMPLETED', NOW(), NULL);

-- Associação task vs categorias

INSERT INTO tb_task_category (task_id, category_id) VALUES (1, 1);
INSERT INTO tb_task_category (task_id, category_id) VALUES (1, 2);
INSERT INTO tb_task_category (task_id, category_id) VALUES (2, 10);
INSERT INTO tb_task_category (task_id, category_id) VALUES (3, 7);
INSERT INTO tb_task_category (task_id, category_id) VALUES (4, 6);
INSERT INTO tb_task_category (task_id, category_id) VALUES (5, 8);
INSERT INTO tb_task_category (task_id, category_id) VALUES (6, 6);
INSERT INTO tb_task_category (task_id, category_id) VALUES (7, 10);
INSERT INTO tb_task_category (task_id, category_id) VALUES (8, 10);
INSERT INTO tb_task_category (task_id, category_id) VALUES (9, 8);
INSERT INTO tb_task_category (task_id, category_id) VALUES (10, 10);
INSERT INTO tb_task_category (task_id, category_id) VALUES (10, 2);
INSERT INTO tb_task_category (task_id, category_id) VALUES (11, 10);
