package smtp;

import data.Email;

import java.io.IOException;

/**
 * Created by Gallouche on 06/04/2017.
 */
public interface ISmtpClient {

    public void sendEmail(Email email) throws IOException;
}
