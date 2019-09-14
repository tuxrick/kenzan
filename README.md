# kenzan
kenzan interview project 


Get Employees
http://localhost:8080/api/webapi/employees

Get Employee 
Receives id
http://localhost:8080/api/webapi/employees/3


Add employee POST 
http://localhost:8080/api/webapi/employees
Post Sample: 
{
    "birth_day": "2019-09-13T20:16:46.76",
    "date_of_employment": "2019-09-13T20:16:46.76",
    "first_name": "Pepe",
    "last_name": "Pecas",
    "middle_name": "Pica Papas",
    "status": "active"
}



Update Employee PUT 
http://localhost:8080/api/webapi/employees/3
Put Sample: 
{
    "birth_day": "2019-09-13T20:16:46.76",
    "date_of_employment": "2019-09-13T20:16:46.76",
    "first_name": "Pepe",
    "last_name": "Pecas",
    "middle_name": "Pica Papas",
    "status": "active"
}


Delete Employee DELETE
Receives id 
http://localhost:8080/api/webapi/employees/3
