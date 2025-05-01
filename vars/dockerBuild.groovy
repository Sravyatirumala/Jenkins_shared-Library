def call(String dockerHubUsername, String imageName) {
    // Build the Docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=b3e6016657mshc0b494c68b2f9cep1dbec3jsnf9fa3b0e5590 -t ${imageName} ."
     // Tag the Docker image
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'Docker-creds']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}