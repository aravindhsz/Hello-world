node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Worspace */
        echo "This is the branch chosen: $params.branch"
        checkout scm
    }

    stage('Build image') {
        

        app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
