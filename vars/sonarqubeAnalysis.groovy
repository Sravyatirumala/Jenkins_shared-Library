def call() {
    withSonarQubeEnv('sonar-server') {
                    sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=youtube1 \
                    -Dsonar.projectKey=youtube1 '''
}
}