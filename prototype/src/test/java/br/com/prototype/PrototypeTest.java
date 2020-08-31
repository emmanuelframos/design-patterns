package br.com.prototype;

import org.junit.Test;

import java.time.LocalDateTime;

public class PrototypeTest {

    @Test
    public void test_prototype_message() throws Exception {
        Message message = new Message();
        message.setFrom("+998876544324");
        message.setTo("+997654232523");
        message.setText("Here is the text.");
        message.setTime(LocalDateTime.now());

        Message clonedMessage = (Message) message.clone();

        assert !message.equals(clonedMessage);
        assert message.getFrom().equals(clonedMessage.getFrom());
        assert message.getTo().equals(clonedMessage.getTo());
        assert message.getText().equals(clonedMessage.getText());
        assert message.getTime().equals(clonedMessage.getTime());

        /** Makes sure the deep copy. **/
        message.setFrom("+998876544325");
        assert !message.getFrom().equals(clonedMessage.getFrom());
    }

    @Test
    public void test_prototype_email() throws Exception {
        Email email = new Email();
        email.setFrom("from@acme.com");
        email.setTo("to@acme.com");
        email.setSubject("Subject");
        email.setBody("Body");

        Email clonedEmail = (Email) email.clone();

        assert !email.equals(clonedEmail);
        assert email.getFrom().equals(clonedEmail.getFrom());
        assert email.getTo().equals(clonedEmail.getTo());
        assert email.getSubject().equals(clonedEmail.getSubject());
        assert email.getBody().equals(clonedEmail.getBody());

        /** Makes sure the deep copy. **/
        email.setFrom("newfrom@acme.com");
        assert !email.getFrom().equals(clonedEmail.getFrom());
    }
}
