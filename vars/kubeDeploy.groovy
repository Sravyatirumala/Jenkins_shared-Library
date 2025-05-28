def call() {
    withKubeConfig(
        caCertificate: '', 
        clusterName: '', 
        contextName: '', 
        credentialsId: 'k8scert', 
        namespace: '', 
        restrictKubeConfigAccess: false, 
        serverUrl: ''
    ) {
        sh '''
            echo "Current directory contents:"
            ls -l
            echo "Running kubectl apply..."
            kubectl apply -f deployment.yml
        '''
    }
}