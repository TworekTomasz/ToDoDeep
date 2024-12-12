# Specification

## Introduction

ToDo is a task management application that allows users to manage their tasks efficiently. 
Project was created as a sandbox for learning and trying out new technologies and methodologies.

## Technical assumptions
The ToDo app backend will be designed using Domain-Driven Design (DDD) principles. 
It aims to manage user tasks efficiently with clear separation of concerns, strong domain modeling, and scalability in mind.

## Specification
Specification is a document that describes the idea of the project, its scope, and the requirements that need to be met.
In this case more like a place for ideas and notes.

### Domain Model 
#### Task
- Attributes
  - id: UUID
  - title: String
  - description: String
  - status: Status
  - dueDate: LocalDate
  - priority: Priority
  - category: Category
  - tags: Set<Tag>
  - assignee: User
  - creator: User
  - creationDate: LocalDateTime
  - lastUpdateDate: LocalDateTime
  - completionDate: LocalDateTime

## Tasks

-[ ] User can create a task
-[ ] User can delete a task
-[ ] User can view all tasks
-[ ] User can view a task by id
-[ ] User can view a task by status
