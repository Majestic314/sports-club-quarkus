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

-- Manager
INSERT INTO manager (id, last_name, first_name, patronymic)
VALUES (1, 'Управленцев', 'Евгений', 'Петрович');
INSERT INTO manager (id, last_name, first_name, patronymic)
VALUES (2, 'Кассиров', 'Александр', 'Алексеевич');

-- Group
INSERT INTO group_def (id, group_type, subscription_visit_pool, coach_id)
VALUES (1, 'Группа 1', 12, 1);
INSERT INTO group_def (id, group_type, subscription_visit_pool, coach_id)
VALUES (2, 'Группа 2', 10, 2);
INSERT INTO group_def (id, group_type, subscription_visit_pool, coach_id)
VALUES (3, 'Группа 3', 8, 3);
INSERT INTO group_def (id, group_type, subscription_visit_pool, coach_id)
VALUES (4, 'Группа 4', 12, null);

-- Subscription
INSERT INTO subscription (id, client_id, manager_id, group_id, visits_left)
VALUES (1, 1, 1, 2, 7);
INSERT INTO subscription (id, client_id, manager_id, group_id, visits_left)
VALUES (2, 2, 2, 2, 5);
