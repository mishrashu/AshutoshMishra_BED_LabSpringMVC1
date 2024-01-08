# AshutoshMishra_BED_LabSpringMVC1
This repo contains a MVC project using Spring Boot &amp; Thymeleaf (Employee Management System). More details are below

## Employee Management System

Has a combination of UI and Backend both. Employee details like First name, Last Name & Email is maintained where Employee Id is auto-generated. The front-end allows users to view the employee details as well as offers updating the existing details and deleting the employee records fully. This application is aimed to provide a basic view of Sprintboot MVC application flow and integration with MySql database. Exceptional handling has been excluded as per scope agreed in Lab session with the mentor.

### Class Structure

1. **EmployeeManagementApplication:** Main class that starts the Springboot application (***Package:*** com.employeemanagement)
  
2. **EmployeeController:** Controller class and offers below endpoints (***Package:*** com.employeemanagement.controller)
   - `/employees` that lists all employee details on the frontend
   - `/employees/new` allows new employee details to be entered on the frontend
   - `/employees/edit/{id}` allows updating the details of an existing employee from the frontend
   - `/employees/{id}` allows deleting an employee record from the frontend

3. **EmployeeRepository:** repository class that extends JPA repository and offers DML etc. operations via a variety of finctions e.g. findbyId, findAll, delete, save etc. (***Package:*** com.employeemanagement.dao)

4. **Employee:** This is entity class that holds employee record e.g. employee id, first name, last name and email.  (***Package:*** com.employeemanagement.entity)

5. **EmployeeService:** A service layer in Springboot application i.e. an interface to offer key functions like findbyId, findAll, delete, save etc. via repository class (***Package:*** com.employeemanagement.service)
   
6. **EmployeeServiceImpl:** An inplementation of  EmployeeService interface (***Package:*** com.employeemanagement.serviceimpl)


### Expected output

**Home**

![image](https://github.com/mishrashu/AshutoshMishra_BED_LabSpringMVC1/assets/39207697/d447f5ed-33b6-4799-ac4d-912ea67fcf04)


**Add Employee**

![image](https://github.com/mishrashu/AshutoshMishra_BED_LabSpringMVC1/assets/39207697/43c4d1e5-fec4-4a2f-be18-14ad07a19a40)

![image](https://github.com/mishrashu/AshutoshMishra_BED_LabSpringMVC1/assets/39207697/72a67b06-f6a3-4d15-98bd-90369860afee)

**Update Employee Record**

![image](https://github.com/mishrashu/AshutoshMishra_BED_LabSpringMVC1/assets/39207697/f1c2ade9-2f64-49a9-a76c-5bd1c618e630)

![image](https://github.com/mishrashu/AshutoshMishra_BED_LabSpringMVC1/assets/39207697/e423fd9b-ed73-4b18-ab1f-bc15026a5313)


**Delete Employee Record**

![image](https://github.com/mishrashu/AshutoshMishra_BED_LabSpringMVC1/assets/39207697/744e4ef6-7351-4a4a-afbf-b77e60dfefe8)
