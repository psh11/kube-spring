FROM eclipse-temurin:17

WORKDIR /app

COPY ./kube-spring.jar ./

ENTRYPOINT ["java", "-jar", "kube-spring.jar", "--spring.profiles.active=kubernetes"]