## JDBC (java Data Base Connectivity)

        JDBC is the concept that having certain API(Classes & Interface file , Java Librarys). Which is used to connectivity with java Application and Database.

* DataBase is one of the data source.

>          Benifits of DBMS
* Data is secured. 
* Data Store the structured format.
* Every it gives a API used the technology for Entering in the database.

>>Driver 
    
    Driver is used to convert java specific call into Database specific call. And Database specific call into Java.

>> Types of Drivers
* JDBC - ODBC Bridge Driver
* Native Driver
* Network Protocol Driver
* Thin Driver



>          There are 5 Steps to Connect 


<ol><li>  <strong> <i>   Load the Driver class

```java 
SQL:- 
Class.forName(com.sql.jdbc.Driver);
   ```


<li> Get the Connetion

```java 
Connection con = DriverManager.getConnection("url","username","password");  
```
```java 
SQL:-
Connection con = DriverManager.getConnection(jdbc:mysql://localhost:3306/tesyDb);

```
<li> Get Statement Object </strong>( To Execute  SQL Query)

```java
Statement st = con.createStatement();
int x= st.executeUpdate("create/update");
```
<li> <b> Get Object of Result Set </b> (Retrive(Select Query))

```java  
ResultSet rs = st.execute("select Query);

while(rs.next()){
    System.out.println(rs.getString(1));
    System.out.println(rs.getString(2));
}
```
<li> <b> Close the Connection </b>

```java 
con.close();
st.close();
```
