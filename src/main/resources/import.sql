-- Client
INSERT INTO client (id, last_name, first_name, patronymic, phone_number)
VALUES (1, 'Петрушкин', 'Василий', 'Николаевич', '8-800-555-35-35');
INSERT INTO client (id, last_name, first_name, patronymic, phone_number)
VALUES (2, 'Васечкин', 'Мыкола', 'Батькович', '8-920-666-18-48');
INSERT INTO client (id, last_name, first_name, patronymic, phone_number)
VALUES (3, 'Волосков', 'Николай', 'Филиппович', '8-999-322-28-11');
INSERT INTO client (id, last_name, first_name, patronymic, phone_number)
VALUES (4, 'Шепелявенко', 'Лев', 'Львович', '8-666-231-65-55');
INSERT INTO client (id, last_name, first_name, patronymic, phone_number)
VALUES (5, 'Святозаров', 'Мстислав', 'Владимирович', '8-988-777-14-44');
INSERT INTO client (id, last_name, first_name, patronymic, phone_number)
VALUES (6, 'Цветкова', 'Мария', 'Вячеславовна', '8-912-911-88-55');

-- Coach
INSERT INTO coach (id, last_name, first_name, patronymic)
VALUES (1, 'Сидоров', 'Сидор', 'Сидорович');
INSERT INTO coach (id, last_name, first_name, patronymic)
VALUES (2, 'Петров', 'Петр', 'Петрович');
INSERT INTO coach (id, last_name, first_name, patronymic)
VALUES (3, 'Иванов', 'Иван', 'Иванович');
INSERT INTO coach (id, last_name, first_name, patronymic)
VALUES (4, 'Михайлов', 'Михаил', 'Михайлович');
INSERT INTO coach (id, last_name, first_name, patronymic)
VALUES (5, 'Васильев', 'Василий', 'Васильевич');

-- Manager
INSERT INTO manager (id, last_name, first_name, patronymic)
VALUES (1, 'Управленцев', 'Евгений', 'Петрович');
INSERT INTO manager (id, last_name, first_name, patronymic)
VALUES (2, 'Кассиров', 'Александр', 'Алексеевич');

-- Group
INSERT INTO group_def (id, group_type, description, subscription_visit_pool, subscription_price, coach_id)
VALUES (1, 'Младшая детская группа', 'От 5 до 8 лет', 8, 1500, 1);
INSERT INTO group_def (id, group_type, description, subscription_visit_pool, subscription_price, coach_id)
VALUES (2, 'Детская группа', 'От 9 до 14 лет', 12, 2100, 2);
INSERT INTO group_def (id, group_type, description, subscription_visit_pool, subscription_price, coach_id)
VALUES (3, 'Старшая детская группа', 'От 14 до 17 лет', 12, 2100, 3);
INSERT INTO group_def (id, group_type, description, subscription_visit_pool, subscription_price, coach_id)
VALUES (4, 'Женская группа', 'От 18 лет', 8, 2100, null);
INSERT INTO group_def (id, group_type, description, subscription_visit_pool, subscription_price, coach_id)
VALUES (5, 'Мужская группа', 'От 18 лет', 12, 3500, 5);

-- Subscription
INSERT INTO subscription (id, client_id, manager_id, group_id, visits_left)
VALUES (1, 1, 1, 2, 7);
INSERT INTO subscription (id, client_id, manager_id, group_id, visits_left)
VALUES (2, 2, 2, 2, 5);
INSERT INTO subscription (id, client_id, manager_id, group_id, visits_left)
VALUES (3, 3, 1, 3, 11);
INSERT INTO subscription (id, client_id, manager_id, group_id, visits_left)
VALUES (4, 4, 2, 1, 2);
INSERT INTO subscription (id, client_id, manager_id, group_id, visits_left)
VALUES (5, 5, 1, 5, 12);
INSERT INTO subscription (id, client_id, manager_id, group_id, visits_left)
VALUES (6, 6, 1, 3, 4);
