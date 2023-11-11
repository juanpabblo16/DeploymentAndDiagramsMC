# DeploymentAndDiagramsMC
The development of the deployment and design of the deployment diagrams of the system of coffee machines interconnected between them and a central server.

- BD CREADA - xhgrid10
- SERVIDOR CENTRAL - xhgrid11
- CLIENTES - xhgrid13
- CLIENTES - xhgrid15
- CLIENTES - xhgrid16
- CLIENTES - xhgrid17

* * *

Despliegue del Proyecto y Creación de la Base de Datos
======================================================

Paso 1: Creación de la Base de Datos
------------------------------------

### 1.1 Acceso a la Máquina Remota

cssCopy code

`ssh postgres@xhgridX`

### 1.2 Navegación a la Carpeta con Archivos SQL

bashCopy code

`cd /Code-2023-04-14/scripts`

### 1.3 Inicio del Cliente de PostgreSQL

undefinedCopy code

`psql -U postgres -d postgres`

### 1.4 Creación de la Base de Datos

csharpCopy code

`CREATE DATABASE CoffeeMach;`

### 1.5 Conexión a la Nueva Base de Datos

csharpCopy code

`\c CoffeeMach`

### 1.6 Ejecución de Scripts SQL

cssCopy code

`\i coffeeMach-user.sql \i coffeeMach-ddl.sql  \i coffeeMach-inserts.sql`

### 1.7 Salida del Cliente de PostgreSQL

cssCopy code

`\q`

Paso 2: Despliegue del Proyecto
-------------------------------

### 2.1 Acceso a la Máquina Remota

cssCopy code

`ssh swarch@xhgridX`

### 2.2 Ejecución de `gradle build` en el Proyecto

bashCopy code

`cd /ruta/proyecto ./gradlew build`

### 2.3 Inicio de Xming y Putty para Gráficos

Iniciar Xming y establecer conexión con Putty para permitir la ejecución de aplicaciones gráficas.

### 2.4 Despliegue de Componentes Gradle

#### 2.4.1 Despliegue de Servidor Central

bashCopy code

`java -jar /ruta/proyecto/ServidorCentral/build/libs/ServidorCentral.jar`

#### 2.4.2 Despliegue de Logística

bashCopy code

`java -jar /ruta/proyecto/Logistica/build/libs/Logistica.jar`

#### 2.4.3 Despliegue de Bodega

bashCopy code

`java -jar /ruta/proyecto/Bodega/build/libs/Bodega.jar`

#### 2.4.4 Despliegue de Máquina de Café

bashCopy code

`java -jar /ruta/proyecto/MaquinaCafe/build/libs/MaquinaCafe.jar`

### 2.5 Verificación del Despliegue

Acceder a las interfaces gráficas o utilizar comandos adicionales para verificar que cada subsistema se haya desplegado correctamente.

* * *

