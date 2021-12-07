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
    
   
   
   
SELECT emp.emp_id, emp.fname, emp.minit, emp.lname, emp.job_id, j.job_desc, emp.job_lvl, emp.pub_id, pubs.pub_name, emp.hire_date, emp.fname + ' ' + emp.minit+ '. ' + emp.lname AS full_name
FROM employee emp
JOIN jobs j ON emp.job_id = j.job_id 
JOIN publishers pubs ON emp.pub_id = pubs.pub_id