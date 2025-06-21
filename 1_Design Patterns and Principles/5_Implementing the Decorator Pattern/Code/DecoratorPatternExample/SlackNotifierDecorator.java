package DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator {
     public SlackNotifierDecorator(Notifier n) {
          super(n);
     }

     @Override
     public String send() {
          return String.format("Decorated for Slack.\n%s", n.send());
     }
}
