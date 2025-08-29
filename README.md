# 📌 Odoo Backend

Backend développé en **Java (Spring Boot)** avec **Gradle**.  
Ce projet gère les entités `Users`, `Task` et leur mapping, avec une architecture claire (DTO, Repository, Controller, Mapper).

---

## 🚀 Technologies utilisées

- **Java 22**
- **Spring Boot**
- **Spring Data JPA**
- **Gradle**
- **Lombok**
- **MapStruct** (pour le mapping DTO ↔ Entity)
- **JUnit 5** (tests unitaires)

---

## 📂 Structure du projet
odoo-backend/
│── build.gradle<br/>
│── settings.gradle <br/>
│── src/ <br/>
│   ├── main/
│   │   ├── java/com/dgdaniel/odoo/ <br/>
│   │   │   ├── OdooApplication.java <br/>
│   │   │   └── app/ <br/>
│   │   │       ├── config/ <br/>
│   │   │       ├── task/ <br/>
│   │   │       └── user/ <br/>
│   │   └── resources/ <br/>
│   │       └── application.properties <br/>
│   └── test/java/com/dgdaniel/odoo/ <br/>
│       └── OdooApplicationTests.java <br/>

