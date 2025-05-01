def call() {
    sh 'trivy image sravyatirumala/youtube:latest > trivyimage.txt'
}