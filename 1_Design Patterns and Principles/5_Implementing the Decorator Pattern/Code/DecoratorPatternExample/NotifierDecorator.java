package DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier {
     Notifier n = null;

     public NotifierDecorator(Notifier n) {
          this.n = n;
     }
}
