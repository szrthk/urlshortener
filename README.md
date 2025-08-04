# URL Shortener — Spring Boot Project

A simple URL Shortener REST API built with **Spring Boot 3.x**, **Java 17**, and **H2 In-Memory Database**.

---

## 🚀 Features
- Shorten long URLs into unique 6-character short codes.
- Retrieve original long URLs using short codes.
- Clean layered architecture (Controller → Service → Repository → Entity).
- API tested via Postman.
- H2 In-Memory DB for quick testing (no external DB setup).

---

## 🛠️ Tech Stack
- Java 17
- Spring Boot 3.4.8
- Spring Data JPA
- H2 Database (In-Memory)
- Lombok
- Postman (API Testing)

---

## 📂 Project Structure
* src/main/java/com/szrthk/urlshortener/
* │
* ├── controller     → URLController.java (Handles API requests)
* ├── service        → URLService.java (Business Logic)
* ├── repository     → URLRepository.java (DB Operations)
* ├── entity         → URLMapping.java (DB Table Structure)
* └── UrlShortenerApplication.java (Main Class)

---

## 📬 API Endpoints

### 1️⃣ POST `/shorten`
- **Description**: Shortens a long URL.
- **Request Body**: Plain Text (NOT JSON)
- **Response Example**:
```json
{
  "id": 1,
  "shortCode": "Ab12Cd",
  "longUrl": "https://www.google.com"
}
```
2️⃣ GET /{shortCode}
•	Description: Retrieves the original long URL.
•	Example: GET /Ab12Cd
•	Response: https://www.google.com


⚙️ Database
•	Uses H2 In-Memory Database.
•	No external DB setup required.

⸻

✍️ Author
•	Sarthak

⸻

📌 Notes
•	This is a minimal URL Shortener to demonstrate Spring Boot core concepts.
•	Possible future enhancements:
•	URL Expiry.
•	Custom short code input.
•	Frontend UI.
