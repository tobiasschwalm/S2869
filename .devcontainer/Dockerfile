FROM mcr.microsoft.com/devcontainers/base:ubuntu

# System-Tools, Compiler, Node.js, Java, PlantUML
RUN apt-get update && \
    apt-get install -y build-essential curl unzip plantuml nodejs openjdk-21-jdk && \
    rm -rf /var/lib/apt/lists/*

# JUnit 5 – Console Standalone (enthält Jupiter + Vintage + Platform)
RUN curl -sL https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.11.4/junit-platform-console-standalone-1.11.4.jar \
    -o /usr/local/lib/junit.jar
