package com.boldseas.mail;

import com.boldseas.mail.exception.SendException;

import java.util.Set;

/**
 * Created by bykj on 2015/9/5.
 */
public interface Sender {
    void sendTo(Mail email,Set<Recipient> recipients) throws SendException;
}
