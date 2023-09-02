# 실험실 4

코틀린의 

companion object와

object의 차이를 살펴보긔

# 실험 결과

## Companion Object를 Java로 바꿨더니

```kotlin
class Lab4UseCompanionObjectMethodService {

    fun useCompanionObjectMethod() {
        companionMethod()
    }

    companion object {

        private const val VALUE = 100

        fun companionMethod() {
            println(VALUE)
        }
    }
}
```

---

```java
public class Lab4UseCompanionObjectMethodService {
   private static final int VALUE = 100;
   @NotNull
   public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

   public void useCompanionObjectMethod() {
      Companion.companionMethod();
   }
   
   public static final class Companion {
      public final void companionMethod() {
         byte var1 = 100;
         System.out.println(var1);
      }

      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
```

---

## Object를 Java로 바꿨더니

```kotlin
class Lab4UseObjectMethodService {

    fun useObjectMethod() {
        RealObject.objectMethod()
    }

    object RealObject{
        private const val VALUE = 100

        fun objectMethod() {
            println("objectMethod - ${VALUE}")
        }
    }
}
```

---

```java
public class Lab4UseObjectMethodService {
   public void useObjectMethod() {
      Lab4UseObjectMethodService.RealObject.INSTANCE.objectMethod();
   }
   
   public static final class RealObject {
      private static final int VALUE = 100;
      @NotNull
      public static final RealObject INSTANCE;

      public final void objectMethod() {
         String var1 = "objectMethod - 100";
         System.out.println(var1);
      }

      private RealObject() {
      }

      static {
         RealObject var0 = new RealObject();
         INSTANCE = var0;
      }
   }
}
```