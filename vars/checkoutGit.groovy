def call(String gitUrl, String gitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: gitBranch]],
        userRemoteConfigs: [[url: ]]
    ])
}



 //branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Sravyatirumala/Youtube-clone-app.git']])

