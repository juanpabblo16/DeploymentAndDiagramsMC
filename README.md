DeploymentAndDiagramsMC - Project Report
========================================

Project Overview
----------------

The DeploymentAndDiagramsMC project focuses on developing the deployment and design of deployment diagrams for a system of interconnected coffee machines with a central server. The project contributors include Juan Pablo Acevedo, Jesus Garces, and Martin Cifuentes.

### Remote Environments

*   **Postgres Database:** `postgres@xhgrid9`
*   **Central Server:** `swarch@xhgrid9`
*   **Client 1:** `swarch@xhgrid13`
*   **Client 2:** `swarch@xhgrid15`
*   **Client 3:** `swarch@xhgrid16`
*   **Client 4:** `swarch@xhgrid17`

File Copying
------------

Before initiating the deployment, source files are copied to the target machines using `scp` commands. Ensure you are in the project folder:

graphqlCopy code

`scp Code-2023-04-14.zip postgres@xhgrid9: scp Code-2023-04-14.zip swarch@xhgrid9: scp Code-2023-04-14.zip swarch@xhgrid13: scp Code-2023-04-14.zip swarch@xhgrid15: scp Code-2023-04-14.zip swarch@xhgrid16: scp Code-2023-04-14.zip swarch@xhgrid17:`

Deployment and Database Creation
--------------------------------

### Step 1: Database Creation

#### 1.1 Access Remote Machine

cssCopy code

`ssh postgres@xhgridX`

#### 1.2 Navigate to SQL Script Folder

bashCopy code

`cd /Code-2023-04-14/scripts`

#### 1.3 Start PostgreSQL Client

undefinedCopy code

`psql -U postgres -d postgres`

#### 1.4 Create Database

sqlCopy code

`CREATE DATABASE CoffeeMach;`

#### 1.5 Connect to New Database

rCopy code

`\c CoffeeMach`

#### 1.6 Execute SQL Scripts

cssCopy code

`\i coffeeMach-user.sq  \i coffeeMach-ddl.sq  \i coffeeMach-inserts.sql`

#### 1.7 Exit PostgreSQL Client

cssCopy code

`\q`

### Step 2: Server Deployment

#### 2.1 Open Xming

#### 2.2 Open PuTTY

#### 2.3 Enter the connection address and enable X11 forwarding

#### 2.4 Click "Open"

#### 2.5 Build the Project

bashCopy code

`cd /Code-2023-04-14/coffeemach gradle build`

#### 2.6 Execute Central Server

bashCopy code

`cd ServidorCentral/build/libs java -jar ServidorCentral.jar`

### Step 3: Coffee Machine Deployment

#### 3.1 Connect to the Device

##### 3.1.1 Start Xming

##### 3.1.2 Open PuTTY

##### 3.1.3 Set the host as "swarch@xhgridX"

##### 3.1.4 Choose SSH connection

##### 3.1.5 Enable X11 forwarding

##### 3.1.6 Press "Open"

#### 3.2 Edit Coffee Machine Ports

##### 3.2.1 Navigate to the project folder with "cd Folder"

##### 3.2.2 Use the command "mc" to explore the project

##### 3.2.3 While in mc, enter coffeemach/coffeeMach/src/main/resources and edit coffeeMach.cfg with "i"

##### 3.2.4 Modify the IP and ports in the configuration file

##### 3.2.5 Save changes with "esc" and ":x"

#### 3.3 Execute the Coffee Machine

##### 3.3.1 In the coffeemach folder, run "gradle build"

##### 3.3.2 Then, in coffeemach/coffeeMach/build/libs, execute `java -jar coffeeMach.jar`

* * *

Contributors
------------

*   **Jesus Garces**
*   **Juan Pablo Acevedo**
*   **Martin Cifuentes**
