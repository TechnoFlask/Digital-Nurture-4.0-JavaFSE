package DecoratorPatternExample;

public class EmailNotifier implements Notifier {
     private String emailContents = null;

     public EmailNotifier(String emailContents) {
          this.emailContents = emailContents;
     }

     @Override
     public String send() {
          return emailContents;
     }
}
