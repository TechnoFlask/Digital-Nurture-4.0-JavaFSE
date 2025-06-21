package DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator {
     public SMSNotifierDecorator(Notifier n) {
          super(n);
     }

     @Override
     public String send() {
          return String.format("Decorated for SMS.\n%s", n.send());
     }
}
