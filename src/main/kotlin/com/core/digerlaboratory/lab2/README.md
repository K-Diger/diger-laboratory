# 실험실 2

@Asnyc 애노테이션이 붙은 메서드가 private한 다른 메서드를 호출하면 그 동작 마저도 비동기로 호출이 될까?

# 실험 결과

- @Async애노테이션 안에 private메서드가 있어도 상관없다.
- @Async 메서드를 호출하는 계층이 Controller, 실제 @Async애노테이션이 달린 메서드의 계층이 Service일 때, 
  - 실제로 @Async 애노테이션이 달린 메서드는 internal까지 접근제어자를 지정해도 동작한다. (private, protected는 금지)

