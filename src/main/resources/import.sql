-- Client
INSERT INTO client (id, last_name, first_name, patronymic, phone_number)
VALUES (1, 'Петрушкин', 'Василий', 'Николаевич', '8-800-555-35-35');
INSERT INTO client (id, last_name, first_name, patronymic, phone_number)
VALUES (2, 'Васечкин', 'Мыкола', 'Батькович', '8-920-666-18-48');

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
