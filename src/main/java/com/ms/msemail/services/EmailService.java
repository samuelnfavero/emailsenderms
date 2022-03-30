package com.ms.msemail.services;

import com.ms.msemail.models.Email;

public interface EmailService {
    Email sendEmail(Email email);
}
