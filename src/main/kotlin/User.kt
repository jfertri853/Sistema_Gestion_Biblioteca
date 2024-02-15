package org.example

sealed class User {
    class Student(id: String, name: String, career: String): User()
    class Professor(id: String, name: String, department: String): User()
    class Visitor(id: String, name: String): User()
}