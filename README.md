# bean-validations

validating bean class properties using hibernate-validator api and regular expressions.
In the above example I have used Spring-MVC and Hibernate-Validate to impose validations like-

1. Name - Name should not be blank, should not contain any special character, Mandatory
2. Mobile No - Lenght should be not more than 10, not blank, First Digit should be 7/8/9
3. Email - mandatory, should contain '@' symbol
4. DOB - input dob in dd-MM-yyyy format. After submitting form result page should dispaly name, mobile no, email id, age(it'll calculate age till date).
