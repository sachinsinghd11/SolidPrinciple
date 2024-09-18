package com.example.solidprinciples.withoutsolid

class Staff(
    val name: String,
    val type: String,
    var department: Department,
    val salary: Double,
) {
    fun engageStudents(subject: String, students: List<Student>) {
        println("Engaging students in subject $subject")
    }
}