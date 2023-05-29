FROM jenkins/ssh-agent:4.2.1-jdk11

USER root

# Install dependencies
RUN apt-get update && apt-get install -y \
    curl \
    python3 \
    python3-pip \
    unzip \
    ansible \
    git

# Install Docker Engine
RUN groupadd -g 997 docker && usermod -aG docker jenkins
RUN curl -fsSL https://get.docker.com | sh

# Install AWS CLI
RUN pip3 install awscli

# Install Docker Compose
RUN curl -fsSL https://github.com/docker/compose/releases/latest/download/docker-compose-Linux-x86_64 -o /usr/local/bin/docker-compose
RUN chmod +x /usr/local/bin/docker-compose

RUN newgrp docker