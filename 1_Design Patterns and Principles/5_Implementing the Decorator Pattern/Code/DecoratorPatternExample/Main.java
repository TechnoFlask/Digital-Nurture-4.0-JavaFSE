package DecoratorPatternExample;

public class Main {
     public static void main(String[] args) {
          Notifier n = new EmailNotifier("Very important email content....");
          System.out.println(n.send());

          n = new SMSNotifierDecorator(n);
          System.out.println(n.send());

          n = new SlackNotifierDecorator(n);
          System.out.println(n.send());
     }
}
