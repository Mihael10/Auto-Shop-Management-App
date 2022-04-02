FROM openjdk:17
EXPOSE 9999
ADD target/auto-shop-management-fullstack.jar auto-shop-management-fullstack.jar
ENTRYPOINT ["java", "-jar", "auto-shop-management-fullstack.jar"]

