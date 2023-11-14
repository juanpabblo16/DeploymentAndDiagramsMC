# DeploymentAndDiagramsMC
The development of the deployment and design of the deployment diagrams of the system of coffee machines interconnected between them and a central server.

- BD CREADA - Postgres@xhgrid9
- SERVIDOR CENTRAL - swarch@xhgrid9
- CLIENTES - xhgrid13
- CLIENTES - xhgrid15
- CLIENTES - xhgrid16
- CLIENTES - xhgrid17

* * *
**Copiado de archivos**

Paso 0: Copiar archivo fuente a los equipos donde se van a desplegar

` 
  //Abrir una consola en Cyguin y parate en la carpeta donde tienes el archivo con el proyecto
  scp Code-2023-04-14.zip postgres@xhgrid9:
  scp Code-2023-04-14.zip swarch@xhgrid9:
  scp Code-2023-04-14.zip swarch@xhgrid13:
  scp Code-2023-04-14.zip swarch@xhgrid15:
  scp Code-2023-04-14.zip swarch@xhgrid16:
  scp Code-2023-04-14.zip swarch@xhgrid17:
`

Despliegue del Proyecto y Creación de la Base de Datos
======================================================

Paso 1: Creación de la Base de Datos
------------------------------------

### 1.1 Acceso a la Máquina Remota

`ssh postgres@xhgridX`

### 1.2 Navegación a la Carpeta con Archivos SQL

`cd /Code-2023-04-14/scripts`

### 1.3 Inicio del Cliente de PostgreSQL

`psql -U postgres -d postgres`

### 1.4 Creación de la Base de Datos

`CREATE DATABASE CoffeeMach;`

### 1.5 Conexión a la Nueva Base de Datos

csharpCopy code

`\c CoffeeMach`

### 1.6 Ejecución de Scripts SQL

`\i coffeeMach-user.sql \i coffeeMach-ddl.sql  \i coffeeMach-inserts.sql`

### 1.7 Salida del Cliente de PostgreSQL

`\q`

Paso 2: Despliegue el Servidor
-------------------------------
### 2.1 Abrir Xming
### 2.2 Abrir PuTTYunzip Code-2023-04-14.zip
### 2.3 Ingesar la direccion a la que te quieres conectar(la casilla ssh debe estar marcada)
### 2.4 Dar click en ssh en la parte inferior izquierda, dar click en X11 marcar la casilla "Enable X11 forwading"
### 2.5 Dar click en open
### 2.6 Hacer build
`cd /Code-2023-04-14/coffeemach`
`gradle build`
### 2.7 Ejecutar ServidorCentral
`cd ServidorCentral/build/libs`
`java -jar ServidorCentral.jar`


* * *

