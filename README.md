# 🚀 SpringBootJp - Product & Category API

A **Spring Boot backend application** implementing a layered architecture with REST APIs for managing products and categories.

---

## 📌 Tech Stack

* Java 17 / 21
* Spring Boot 3
* Spring Web
* Spring Data JPA
* H2 Database
* Maven
* Lombok

---

## 🏗️ Architecture

```text
controller → service → repository → database
         ↘ dto ↔ mapper ↗
```

---

## 📁 Project Structure

```text
controller/   → REST APIs
service/      → Business logic
repository/   → JPA layer
entity/       → Database models
dto/          → Data transfer objects
mapper/       → Entity ↔ DTO conversion
```

---

## 📦 Features

### ✅ Product APIs

* Create Product
* Get All Products
* Get Product by ID
* Update Product
* Delete Product

### ✅ Category APIs

* Create Category
* Get All Categories
* Update Category
* Delete Category

---

## ▶️ Run Project

```bash
./mvnw spring-boot:run
```

OR

```bash
java -jar target/productlsit-0.0.1-SNAPSHOT.jar
```

---

## 🌐 Base URL

```text
http://localhost:8080
```

---

## 🧪 Testing

Use **Postman** or any REST client.

---

## 🎯 Learning Highlights

* Layered Architecture
* DTO Pattern
* Mapper usage
* Spring Data JPA
* REST API Design

---

## 👨‍💻 Author

**Jay Barade**

---

## ⭐ Future Improvements

* Validation (@Valid)
* Exception handling (GlobalExceptionHandler)
* MySQL integration
* Pagination & Sorting
