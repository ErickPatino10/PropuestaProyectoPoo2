# Sistema de Hospital - Módulo de Clientes

Este proyecto implementa el módulo de gestión de clientes utilizando Programación Orientada a Objetos (POO), arquitectura Modelo-Vista-Controlador (MVC), patrón DAO y base de datos PostgreSQL, desarrollado de forma colaborativa.

---

## 👥 Integrantes del Equipo

* **Erick Patiño**
* **Francisco Lanche**
* **Jordy Cajas**
* **David Pilatuña**

---

## 🛠️ Tecnologías y Requisitos

* **Lenguaje:** Java (con JavaFX para la interfaz gráfica)
* **Gestor de dependencias:** Maven (para la gestión de librerías y dependencias)
* **Base de datos:** PostgreSQL
* **Control de versiones:** Git / GitHub (integración en paralelo mediante ramas)

---

## 📂 Estructura del Proyecto

El proyecto está organizado por responsabilidades para mantener un código escalable y fácil de mantener:

* `modelo/`: Contiene las clases de entidad (ej. `Cliente.java`)
* `vista/`: Contiene los archivos de la interfaz gráfica (`Cliente.fxml`)
* `controlador/`: Contiene la lógica que conecta la vista con el modelo (`ClienteController.java`)
* `dao/`: Encapsula las operaciones con la base de datos (`ClienteDAO.java`)
* `util/`: Clases de utilidad y conexión a PostgreSQL (`Conexion.java`)

---

## 🚀 Instrucciones de Configuración

1. **Base de Datos:** Ejecuta el script SQL en tu entorno PostgreSQL (pgAdmin o psql) para crear la base de datos y la tabla `clientes`.
2. **Dependencias:** Asegúrate de incluir el driver JDBC de PostgreSQL en tu archivo `pom.xml`.
3. **Módulos:** Configura correctamente el archivo `module-info.java` para habilitar los permisos de JavaFX y Java SQL.
4. **Ejecución:** Ejecuta la clase `Main.java` para iniciar la interfaz gráfica del módulo de clientes.
