# Microservice-Configuration
## It explains different configuration available in Spring Boot Project

    1. Fetch properties value by adding @Value("${<<variable_name>>}")
    2. Place application.properties file where jar is present and run it. It will overwrite the values from External Properties.
    3. Mention default value in code if values are not mentioned in properties file i.e. @Value("${<<variable_name>>: <<default_value>>}")
    