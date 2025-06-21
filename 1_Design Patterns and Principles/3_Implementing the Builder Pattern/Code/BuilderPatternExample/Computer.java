package BuilderPatternExample;

public class Computer {
     private String cpu = null;
     private int ram, storage;

     private Computer(Builder b) {
          this.cpu = b.cpu;
          this.ram = b.ram;
          this.storage = b.storage;
     }

     @Override
     public String toString() {
          return "Computer [cpu=" + cpu + ", ram=" + ram + "GB, storage=" + storage + "GB]";
     }

     public static class Builder {
          private String cpu = null;
          private int ram, storage;

          Computer build() {
               return new Computer(this);
          }

          public Builder setCpu(String cpu) {
               this.cpu = cpu;
               return this;
          }

          public Builder setRam(int ram) {
               this.ram = ram;
               return this;
          }

          public Builder setStorage(int storage) {
               this.storage = storage;
               return this;
          }
     }
}
