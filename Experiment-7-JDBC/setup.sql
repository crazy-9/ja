CREATE DATABASE IF NOT EXISTS college;
USE college;

CREATE TABLE IF NOT EXISTS student (
    roll INT PRIMARY KEY,
    name VARCHAR(30),
    branch VARCHAR(20)
);

INSERT INTO student (roll, name, branch)
VALUES
    (1, 'Amit', 'Computer'),
    (2, 'Neha', 'Computer'),
    (3, 'Rahul', 'IT')
ON DUPLICATE KEY UPDATE
    name = VALUES(name),
    branch = VALUES(branch);
