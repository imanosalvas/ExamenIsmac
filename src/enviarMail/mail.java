package enviarMail;

import java.awt.Color;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTML;






public class mail {

    public void envioMail(String destinatarioMail, String asuntoo, String Mensaje ) {
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(propiedad);

        String correoEnvia = "eventosismac@gmail.com";
        String contrasena = "eventos1234";
        String destinatario = destinatarioMail;
        String asunto = asuntoo;
        String mensaje = Mensaje;

        MimeMessage mail = new MimeMessage(sesion);

        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setContent(Mensaje, "text/html");
            mail.setText(Mensaje);
 
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();

            
            JOptionPane.showMessageDialog(null, "Correo enviado");

        } catch (AddressException ex) {
            Logger.getLogger(mail.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Correo no enviado ");
            
        } catch (MessagingException ex) {
            Logger.getLogger(mail.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Correo enviado");
            
        }
        
    }
}
