# Full-Stack Inventory Management System (Microservices)

This project is a containerized Full-Stack application featuring a **Spring Boot** backend, a **React (Vite)** frontend, and a **PostgreSQL** database.

##   Architecture & Tech Stack
- **Backend:** Java 21, Spring Boot 3.x, Spring Data JPA
- **Frontend:** React 18, Vite, Axios
- **Database:** PostgreSQL 16
- **DevOps:** Docker, Docker Compose (Multi-stage builds)

##   Features
- **RESTful API:** Developed with Spring Boot for CRUD operations.
- **Modern UI:** Responsive React interface with real-time updates.
- **Orchestration:** Entire system starts with a single command via Docker Compose.
- **Optimization:** Multi-stage Docker builds for minimal image size.

##   How to Run
Ensure you have **Docker** and **Docker Compose** installed.

1. Clone the repository:
   ```bash
   git clone [https://github.com/cengiztansel/cengiztansel.git](https://github.com/cengiztansel/inventory-service-fullstack.git)
2.	Navigate to the project root:
Bash
cd inventory-service-fullstack
3.	Start the entire system:
Bash
docker-compose up --build -d
4.	Access the applications:
o	Frontend: http://localhost:3000
o	Backend API: http://localhost:8080/api/products

⚙️ CI/CD
Future updates will include GitHub Actions for automated testing and Docker Hub deployment.
