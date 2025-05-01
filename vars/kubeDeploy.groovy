def call() {
    withKubeConfig(
        caCertificate: '', 
        clusterName: '', 
        contextName: '', 
        credentialsId: 'k8scertificate', 
        namespace: '', 
        restrictKubeConfigAccess: false, 
        serverUrl: ''
    ) {
        sh "kubectl apply -f deployment.yml"
    }
}
