CREATE TABLE accounts (
    account_id NUMBER PRIMARY KEY,
    account_holder VARCHAR2(100),
    balance NUMBER(10,2),
    account_type VARCHAR2(20)
);

INSERT INTO accounts VALUES (1, 'Rahul Sharma', 5000.00, 'SAVINGS');
INSERT INTO accounts VALUES (2, 'Anjali Mehta', 3000.00, 'CURRENT');
INSERT INTO accounts VALUES (3, 'Kiran Das', 10000.00, 'SAVINGS');
INSERT INTO accounts VALUES (4, 'Meera Iyer', 1500.00, 'SAVINGS');
INSERT INTO accounts VALUES (5, 'Ravi Kumar', 8000.00, 'CURRENT');
CREATE TABLE employees (
    employee_id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    salary NUMBER(10,2),
    department_id NUMBER
);

INSERT INTO employees VALUES (101, 'Rajiv Singh', 50000, 10);
INSERT INTO employees VALUES (102, 'Sneha Kapoor', 55000, 20);
INSERT INTO employees VALUES (103, 'Amit Verma', 48000, 10);
INSERT INTO employees VALUES (104, 'Pooja Nair', 60000, 30);
INSERT INTO employees VALUES (105, 'Alok Joshi', 47000, 20);
CREATE TABLE error_log (
    log_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    error_message VARCHAR2(255),
    error_date DATE
);
COMMIT;

