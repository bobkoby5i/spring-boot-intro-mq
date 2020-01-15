FROM openjdk:11-jdk
EXPOSE 8081
ADD docker/intro-mq-wh01.jar /
CMD java -jar \
    -Dspring.profiles.active=$ACTIVE_PROFILE \
    intro-mq-wh01.jar