properties([parameters([choice(choices: ['master', 'first', 'second'], description: 'selection of branch', name: 'hellobranch')])])
node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Workspace */

        checkout scm
    }

    stage('Build image') {
        

        app = docker.build("aravindhsz/helloworld_using_pipeline")
    }

    

  
}
