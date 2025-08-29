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
│── build.gradle
│── settings.gradle
│── src/
│   ├── main/
│   │   ├── java/com/dgdaniel/odoo/
│   │   │   ├── OdooApplication.java
│   │   │   └── app/
│   │   │       ├── config/
│   │   │       ├── task/
│   │   │       └── user/
│   │   └── resources/
│   │       └── application.properties
│   └── test/java/com/dgdaniel/odoo/
│       └── OdooApplicationTests.java

