def call() {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'k8\'scertificate', namespace: '', restrictKubeConfigAccess: false, serverUrl: '') 
        sh "kubectl  delete -f deployment.yml"
    }