 CREATE TABLE Teacher (
        employee_id INT NOT NULL AUTO_INCREMENT,
        first_name VARCHAR(30) NOT NULL,
        last_name VARCHAR(30) NOT NULL,
        email VARCHAR(30) NOT NULL,
        joining_date DATE NOT NULL,
        annual_review_date DATE,
        avg_rating INT,
        PRIMARY KEY (employee_id)
    );
    
   
 CREATE TABLE Student (
        student_id INT NOT NULL AUTO_INCREMENT,
        first_name VARCHAR(30) NOT NULL,
        last_name VARCHAR(30) NOT NULL,
        address VARCHAR(30) NOT NULL,
        dob DATE NOT NULL,
        age INT NOT NULL,
        registration_date DATE NOT NULL,
        parent_id INT,
        teacher_assigned INT,
        PRIMARY KEY (student_id),
        FOREIGN KEY (parent_id) REFERENCES Parent(parent_id),
        FOREIGN KEY (teacher_assigned) REFERENCES Teacher(teacher_id)
    );
    
    
    CREATE TABLE Parent (
        parent_id INT NOT NULL AUTO_INCREMENT,
        first_name VARCHAR(30) NOT NULL,
        last_name VARCHAR(30) NOT NULL,
        email VARCHAR(50) NOT NULL,
        phone bigint NOT NULL,
        PRIMARY KEY (parent_id)
    );
    
    CREATE TABLE Vaccine (
        vaccine_id INT NOT NULL AUTO_INCREMENT,
        name VARCHAR(30) NOT NULL,
        description VARCHAR(30) NOT NULL,
        doses_taken INT NOT NULL,
        total_doses INT NOT NULL,
        doses_taken_dates  VARCHAR(100),
        last_shot_date DATE,
        upcoming_shot_date DATE,
        student_id INT NOT NULL,
        is_vaccinated bit, 
        PRIMARY KEY (vaccine_id),
        FOREIGN KEY (student_id) REFERENCES Student(student_id)
    );