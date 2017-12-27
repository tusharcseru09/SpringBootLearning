# Spring Boot with Hibernate (Some Basic)
http://o7planning.org/en/11665/spring-boot-hibernate-and-spring-transaction-tutorial

<pre>
<b>Controller</b> can use <b>Service</b> bean similarly Service can Repository and Repository can SessionFactory
</hr>
Controller
RestController
  |
  -->@Autowired
     Service Class
        |
        -->@Autowired
           Repository Class
              |
              -->@Autowired
                 SessionFactory
 </pre>               
# Entity Manager 
https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html
https://stackoverflow.com/questions/5640778/hibernate-sessionfactory-vs-entitymanagerfactory

# Some Problem and Resolution we must need to know 
https://stackoverflow.com/questions/26203446/spring-hibernate-could-not-obtain-transaction-synchronized-session-for-current
