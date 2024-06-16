# Spring Doma2 Example

This repository contains sample code for accessing multiple databases using Spring and Doma2. It demonstrates executing transactions on two databases: dbserver001 (MySQL) and dbserver002 (PostgreSQL).

## Structure of the Sample Code

The main components included in this repository are as follows:

- `com.github.katohk.sample.doma2`
    - `MainApp.java`: The main class. It uses `DBService` to access the two databases.
    - `DBService.java`: The database access service class. This class implements methods to execute transactions using two different DAOs.
- `com.github.katohk.sample.doma2.db001`
    - The package for accessing dbserver001. The connection information is defined in `resources/dbconfig001.xml`.
- `com.github.katohk.sample.doma2.db002`
    - The package for accessing dbserver002. The connection information is defined in `resources/dbconfig002.xml`.
