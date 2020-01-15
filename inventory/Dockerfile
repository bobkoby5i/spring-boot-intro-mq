FROM openjdk:11-jdk
EXPOSE 8090
ADD docker/intro-mq-inventory.jar /
CMD java -jar \
    -Dspring.profiles.active=$ACTIVE_PROFILE \
    intro-mq-inventory.jar