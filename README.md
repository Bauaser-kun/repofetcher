# Repo Fetcher
Repo Fetcher is a Spring Boot application that allows users to fetch GitHub repositories based on a provided username. It utilizes the GitHub REST API to retrieve repository information.

## Features
- Fetch GitHub repositories for a given username.
- Display repository names, owner login, and branch information.
- Exclude forked repositories from the results.

## Prerequisites
Before running the application, make sure you have the following installed:
- Java Development Kit (JDK) version 21
- Gradle version 8.5 or later
- MySQL databse configured (default name gitRepoDB) and system variables for usename and password applied

## Application Properties
In aplication.properties file you may change database name if you create a database with a different name or hardcode username and password instead of variables.
