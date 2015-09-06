package com.boldseas.mail;

import com.boldseas.mail.exception.From;
import com.boldseas.mail.exception.SendException;

import java.util.Set;

/**
 * Created by bykj on 2015/9/5.
 */
public interface Sender {
     boolean sendTo(MailMessage email,From from,Set<Recipient> recipients) throws SendException;
}
