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

`ssh nombre-usuario@direccion-servidor`

### 1.2 Navegación a la Carpeta con Archivos SQL

bashCopy code

`cd /ruta/remota`

### 1.3 Inicio del Cliente de PostgreSQL

undefinedCopy code

`psql -U nombre-usuario -d postgres`

### 1.4 Creación de la Base de Datos

csharpCopy code

`CREATE DATABASE nombre-base-datos;`

### 1.5 Conexión a la Nueva Base de Datos

csharpCopy code

`\c nombre-base-datos`

### 1.6 Ejecución de Scripts SQL

cssCopy code

`\i archivo1.sq  \i archivo2.sql`

### 1.7 Salida del Cliente de PostgreSQL

cssCopy code

`\q`

Paso 2: Despliegue del Proyecto
-------------------------------

### 2.1 Acceso a la Máquina Remota

cssCopy code

`ssh nombre-usuario@direccion-servidor`

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

Este informe detalla el proceso de creación de la base de datos y el despliegue del proyecto. Asegúrate de ajustar las rutas, nombres de usuario y otros detalles según tu configuración específica. Este proceso asume que ya tienes el entorno y las dependencias necesarias configuradas en las máquinas remotas.
