# spring-prototype-demo
inject prototype bean into singleton bean, and destroy prototype bean demo




### Inject Prototype into Singleton Bean

How to inject prototype bean into singleton bean.

- inject ApplicationContext, and get prototype bean 
- Using Proxy Mode to create prototype bean.
- Using Provider .
- Using @Lookup annotation on a method.

Refer [Injecting Prototype Beans into a Singleton Instance in Spring](<https://www.baeldung.com/spring-inject-prototype-bean-into-singleton>)

### Deconstruct callback for Prototype  bean

Spring context will not manage the destroy method for prototype beans, even if a prototype bean implement a disposable interface.

So it's better to call destroy method  manually if you need to release some resources for the prototype bean. There is another solution to let spring context invoke the destroy method. Refer to [Spring: destroy prototype beans](http://iryndin.net/post/spring_destroy_prototype_beans/) 



Refer to [spring-prototype-demo](<https://github.com/zengbiaobiao/spring-prototype-demo>) to get the demo project.
