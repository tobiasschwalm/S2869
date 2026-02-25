FROM mcr.microsoft.com/devcontainers/base:ubuntu

# System-Tools, Compiler, Node.js, Java, PlantUML
RUN apt-get update && \
    apt-get install -y build-essential curl unzip plantuml nodejs openjdk-21-jdk && \
    rm -rf /var/lib/apt/lists/*
