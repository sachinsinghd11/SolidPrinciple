package com.example.solidprinciples.srp

class EmailService{
    fun sedEmail(message: String){
        //logic to send email
    }
}


class NotificationService{
    private val emailService: EmailService = EmailService()

    fun notifyUser(message: String){
        emailService.sedEmail(message)
    }
}