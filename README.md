 Write a Spring Boot REST application which will provide following CRUD operations for 
“Vehicle” and “User” resource running in Automobile Company. 
1) Add new Vehicle. 
2) Fetch all Vehicle for given User. (need to provide User name) 
3) Delete vehicle records for given User. (need to provide User name)



 
Vehicle has the following attributes:  
1) Id (unique identifier for each Projects, auto generated, starts from 1) 
2) Vname (Cannot be Blank, Example: Splendor, Amaze, Pulsar, etc.) 
3) Company (Enum, Example: Hero, Honda, Bajaj, etc.) 
4) Vnumber (Cannot be Blank, Example: MH09AB1111, MH10CD2222, MHEF3333, etc.) 
5) Vtype (Cannot be Blank, Example: bike, sedan, cruiser, etc.) 
6) Uid (User ID, FK)


   
 
User has the following attributes: (Enter Sample Data in Database) 
1) Uid (unique identifier for each User) 
2) Uname (Cannot be Blank) 
3) Email (Cannot be Blank) 
4) Password (Cannot be blank, min 6 characters) 
5) City (Cannot be Blank) 
6) Contact_No (Cannot be blank, min 10 digit)


   
 
• Use MySQL Relational Database to save resource. 
• Create Payload will have fields like – Vname, Company, Vnumber, Vtype, Uid 
• “Id (auto generated)” will be populated by the Service. 
• There should be Validation on Create Payload. 
For example:  
1) Vname, Vtype should not be blank. 
2) Vnumber should not be blank and length must be 10 
3) If User does not exist then Vehicle must not be registered under that user (display 
relevant message). 
4) None of the fields in Vehicle table are Nullable. 
• Rest URL should be named as per REST best practices. 
• Response codes should be as per REST guidelines 
(201 for resource creation, 404 for not found, 200 for ok) 
• Error handling in case of failures. (Optional : Global Exception Handling) 
Note:- You have to test all API's on Postman / Swagger
