#!/bin/bash

function build_image() {
    JAR=$1
    APP_NAME=$2

    docker build -f ./docker/file/Dockerfile \
        --build-arg JAR_FILE=${JAR} \
        -t ${APP_NAME}:latest .
}

APP_VERSION=0.0.1-SNAPSHOT

cd ..

cd ..

mvn clean package -DskipTests

build_image ./eureka-server/target/eureka-server-${APP_VERSION}.jar application/eureka-server
build_image ./config-server/target/config-server-${APP_VERSION}.jar application/config-server
build_image ./user-demo-microservice/target/user-demo-microservice-${APP_VERSION}.jar application/user-demo-microservice
build_image ./api-gateway/target/api-gateway-${APP_VERSION}.jar application/api-gateway
