DROP TABLE IF EXISTS student_course;
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS courses;

CREATE TABLE students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE courses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE student_course (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_id BIGINT NOT NULL,
    course_id BIGINT NOT NULL,
    FOREIGN KEY (student_id) REFERENCES students(id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES courses(id) ON DELETE CASCADE
);

INSERT INTO students (name) VALUES 
('Person 1'), 
('Person 2'), 
('Person 3'), 
('Person 4');

INSERT INTO courses (name) VALUES 
('Math 101'), 
('Physics'), 
('Chemistry'), 
('History');

INSERT INTO student_course (student_id, course_id) VALUES 
(1, 1), 
(1, 2), 
(2, 3), 
(3, 4), 
(4, 1);
