# Microservice-Configuration
## It explains different configuration available in Spring Boot Project

    1. Fetch properties value by adding @Value("${<<variable_name>>}")
    2. Place application.properties file where jar is present and run it. It will overwrite the values from External Properties.
    3. Mention default value in code if values are not mentioned in properties file i.e. @Value("${<<variable_name>>: <<default_value>>}")
    4. Creating @Configuration bean and use of @ConfigurationProperties("<<prefix_value>>")
    5. Introduce of Actuator in Spring Boot (http://localhost:8080/actuator/configprops)
    6. Profile set for different env
        a. If no profile set, Spring boot works in default profile.
        b. properties file should be defined in application-<<env_name>>.<<extn_name>>
        c. add active profile details in default application.properties: spring.profiles.active=qa
        d. We can pass the env name while running jar file from command line argument: java -jar microservice-configuration-0.0.1-SNAPSHOT.jar --spring.profiles.active=qa
    